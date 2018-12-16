package fhnw.hackermans.shopstantlySPRING;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.json.BasicJsonParser;
import org.springframework.boot.json.JsonParser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import fhnw.hackermans.shopstantlySPRING.domain.orderManagement.Customer;
import fhnw.hackermans.shopstantlySPRING.domain.orderManagement.CustomerRepo;
import fhnw.hackermans.shopstantlySPRING.domain.orderManagement.Order;
import fhnw.hackermans.shopstantlySPRING.domain.orderManagement.OrderPositions;
import fhnw.hackermans.shopstantlySPRING.domain.orderManagement.OrderPositionsRepo;
import fhnw.hackermans.shopstantlySPRING.domain.orderManagement.OrderRepo;
import fhnw.hackermans.shopstantlySPRING.domain.orderManagement.Product;
import fhnw.hackermans.shopstantlySPRING.domain.orderManagement.ProductRepo;

@SpringBootApplication
@Controller
@EnableAutoConfiguration
public class ShopstantlySpringApplication {
	@Autowired
	private ProductRepo prodRepo;
	
	@Autowired
	private OrderRepo orderRepo;
	
	@Autowired
	private OrderPositionsRepo orderPosRepo;
	
	@Autowired
	private CustomerRepo custRepo;

	public static void main(String[] args) {
		SpringApplication.run(ShopstantlySpringApplication.class, args);
	}

	// Map homepage
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "This is the homepage, faggots";
	}
	
	// Map customer table
	@RequestMapping("/customer")
	@ResponseBody
	Iterable<Customer> getAllCustomers() {
		return custRepo.findAll();
	}

	// Map product table
	@RequestMapping("/product")
	@ResponseBody
	Iterable<Product> getAllProducts() {
		return prodRepo.findAll();
	}

	// Map order table
	@RequestMapping("/order")
	@ResponseBody
	Iterable<Order> getAllOrders() {
		return orderRepo.findAll();
	}

	// Map order positions
	@RequestMapping("/orderPositions")
	@ResponseBody
	Iterable<OrderPositions> getOrderPositions() {
		return orderPosRepo.findAll();
	}

	// Map order creation
	@RequestMapping("/createOrder")
	@ResponseBody
	void createOrder(@RequestBody String jsonOrder) {
		String subStr = jsonOrder.substring(jsonOrder.indexOf("\"qty\": "));
		subStr = subStr.substring(0, subStr.indexOf(","));
		subStr = subStr.substring(8, subStr.length()-1);
		int qty = Integer.parseInt(subStr);

		subStr = jsonOrder.substring(jsonOrder.indexOf("\"product\": "));
		subStr = subStr.substring(0, subStr.indexOf("}")).trim();
		subStr = subStr.substring(12, subStr.length()-1);
		String product = subStr;

		// create order and position
		Order o = new Order();
		Customer c = custRepo.findByCustomerId(11);
		o.setCustomer(c);
		o.setDate(new Date());
		o.setState("open");
		Order oCreated = orderRepo.saveAndFlush(o);
		
		OrderPositions op = new OrderPositions();
		op.setOrder(o);
		Product p = prodRepo.findByProductName(product).get(0);
		op.setProduct(p);
		op.setQty(qty);
		orderPosRepo.save(op);
		
		// call payment micro service
		//System.out.println(oCreated.getOrderId());
		String uri = "http://hm-payment.herokuapp.com/payOrder";
	    String parms = "?orderId="+ oCreated.getOrderId() + "&amount=" + (p.getPrice()*qty);
	    RestTemplate restTemplate = new RestTemplate();
	    restTemplate.getForObject((uri+parms), String.class);
	    
	    // Call inventory micro service
		int prodId = p.getProdId();
	    uri = "http://hm-inventory.herokuapp.com/getFromWarehouse";
	    parms = "?prodId="+ prodId + "&amount=" + qty;
	    restTemplate = new RestTemplate();
	    restTemplate.getForObject((uri+parms), String.class);
	    
	    // Call shipping micro service
	    uri = "http://hm-shipping.herokuapp.com/shipOrder";
	    parms = "?orderId="+ oCreated.getOrderId();
	    restTemplate = new RestTemplate();
	    restTemplate.getForObject((uri+parms), String.class);
	}
}
