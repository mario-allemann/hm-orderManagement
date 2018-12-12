package fhnw.hackermans.shopstantlySPRING;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import fhnw.hackermans.shopstantlySPRING.domain.shipping.Shipping;
import fhnw.hackermans.shopstantlySPRING.domain.shipping.ShippingRepo;

@SpringBootApplication
@Controller
@EnableAutoConfiguration
public class ShopstantlySpringApplication {
	@Autowired 
	private TestRepo testRepo;
	@Autowired 
	private ShippingRepo shippingRepo;

	public static void main(String[] args) {
		SpringApplication.run(ShopstantlySpringApplication.class, args);
	}

	// Map homepage
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "This is the homepage, faggots";
	}

	// Map test page
	@RequestMapping("/test")
	@ResponseBody
	Iterable<TestTable> getAllTests() {
		return testRepo.findAll();
	}

	@RequestMapping("/add")
	public @ResponseBody String addTest(@RequestParam String testAtt) {
		TestTable t = new TestTable();
		t.setTestAtt(testAtt);
		testRepo.save(t);
		return "Saved";
	}

	// Map test page
	@RequestMapping("/shipping")
	@ResponseBody
	Iterable<Shipping> getAllShippings() {
		return shippingRepo.findAll();
	}

	@RequestMapping("/addShipping")
	public @ResponseBody String addShipping(@RequestParam String orderId) {
		Shipping s = new Shipping();
		s.setEstimatedDate(new Date());
		s.setEffectiveDate(new Date());
		s.setOrderId(Integer.parseInt(orderId));
		shippingRepo.save(s);
		return "Saved";
	}
}
