package com.guilherme.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {

				"com.guilherme.springbootdemo"
		}
)

public class SpringbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}

}
