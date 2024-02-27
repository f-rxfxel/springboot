package topavansi.univas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import topavansi.univas.models.ProductEntity;

@RestController
@RequestMapping("/hello")

public class HelloController {
	@GetMapping("/v1")
	public String hello() {
		return "Hello v1!";
	}

	@GetMapping("/v2")
	public String hello2() {
		return "Hello v2!";
	}
	
	@GetMapping("/product")
	public ProductEntity helloProduct() {
		return new ProductEntity(1, "Product test", 2.45f, true);
	}
}