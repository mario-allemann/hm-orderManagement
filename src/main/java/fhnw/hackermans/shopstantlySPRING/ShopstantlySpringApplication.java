package fhnw.hackermans.shopstantlySPRING;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class ShopstantlySpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopstantlySpringApplication.class, args);
	}

	// Map homepage
	@RequestMapping("/")
	String home() {
		return "This is the homepage, faggots";
	}

	// Map test page
	@RequestMapping("/test")
	String test() {
		return "Test test test";
	}
}
