package com.example.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Myapp {

	public static void main(String[] args) {
		SpringApplication.run(Myapp.class, args);
	}

	@GetMapping(value = "/")
    public String hello() {
        return "Hello World!";
    }

}
