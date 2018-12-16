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
		JsonParser jsonParser = new BasicJsonParser();
		Map<String, Object> jsonMap = null;
		try {
			jsonMap = jsonParser.parseMap(jsonOrder);
		} catch (Exception e) {
			// do nothing
		}
		Map<String, Object> queryResults = (Map<String, Object>) jsonMap.get("queryResult");
		ArrayList<String> outputContexts = (ArrayList<String>) queryResults.get("outputContexts");
		String entryJson = outputContexts.get(0);
		Map<String, Object> entryMap = null;
		try {
			entryMap = jsonParser.parseMap(entryJson);
		} catch (Exception e) {
			// do nothing
		}
		Map<String, String> parameters = (Map<String, String>) entryMap.get("parameters");

		int qty = Integer.parseInt(parameters.get("qty"));
		String product = parameters.get("product");

		// create order and position
		Order o = new Order();
		Customer c = custRepo.findByCustomerId(11);
		o.setCustomer(c);
		o.setDate(new Date());
		o.setState("open");
		orderRepo.save(o);
		
		OrderPositions op = new OrderPositions();
		op.setOrder(o);
		Product p = prodRepo.findByProductName(product).get(0);
		op.setProduct(p);
		op.setQty(qty);
		orderPosRepo.save(op);
		
		// call payment micro service
		int orderId = o.getOrderId();
		String uri = "http://hm-payment.herokuapp.com/pay";
	    String parms = "?orderId="+ orderId + "&amount=" + qty;
	    RestTemplate restTemplate = new RestTemplate();
	    restTemplate.getForObject((uri+parms), String.class);
	    
	    // Call inventory micro service
		int prodId = p.getProdId();
	    uri = "http://hm-inventory.herokuapp.com/getFromWarehouse";
	    parms = "?prodId="+ prodId + "&amount=" + qty;
	    restTemplate = new RestTemplate();
	    restTemplate.getForObject((uri+parms), String.class);
	    
	    // Call shipping micro service
	    /*uri = "http://hm-shipping.herokuapp.com/ship";
	    parms = "?orderId="+ orderId;
	    restTemplate = new RestTemplate();
	    restTemplate.getForObject((uri+parms), String.class);*/
	}
}
