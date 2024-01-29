package com.devops.devopsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevOpsAppApplication {

	@GetMapping("/get")
	public String getMessage(){
		return "Hello world!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevOpsAppApplication.class, args);
	}

}
