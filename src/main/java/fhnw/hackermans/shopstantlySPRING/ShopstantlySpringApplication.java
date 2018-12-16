package fhnw.hackermans.shopstantlySPRING;

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

import fhnw.hackermans.shopstantlySPRING.domain.orderManagement.Product;
import fhnw.hackermans.shopstantlySPRING.domain.orderManagement.ProductRepo;

@SpringBootApplication
@Controller
@EnableAutoConfiguration
public class ShopstantlySpringApplication {
	@Autowired 
	private ProductRepo prodRepo;

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
	@RequestMapping("/product")
	@ResponseBody
	Iterable<Product> getAllProducts() {
		return prodRepo.findAll();
	}
	
	// Map test page
	@RequestMapping("/createOrder")
	@ResponseBody
	String createOrder(@RequestBody String jsonOrder) {
		JsonParser jsonParser = new BasicJsonParser();
		Map<String, Object> jsonMap = null;
		try {
			jsonMap = jsonParser.parseMap(jsonOrder);
		} catch (Exception e) {
			// do nothing
		}
		Map<String, Object> outputContexts = (Map<String, Object>)jsonMap.get("queryResults");
		String retString = "";
		for (Map.Entry<String, Object> entry : outputContexts.entrySet()) {
			retString += "KEY: " + entry.getKey() + "-> VALUE: " + entry.getValue().toString() + "\r\n";
		}
		return retString;
	}
}
