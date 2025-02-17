package com.example.devsecops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
class DevsecopsApplicationTests {

	@GetMapping("/")
	public String hello() {
		return "<html><body><h1>Hello DevSecOps</body></h1></html>";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevsecopsApplication.class, args);
	}

}
