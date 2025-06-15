package com.guilherme.java.spring.produtosapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProdutosapiApplication {


	@GetMapping("/hello-world")
	public String helloWorld(){
		return "Hello, World";
	}

	public static void main(String[] args) {
		SpringApplication.run(ProdutosapiApplication.class, args);
	}

}
