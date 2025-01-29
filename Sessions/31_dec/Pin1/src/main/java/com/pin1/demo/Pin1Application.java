package com.pin1.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.pin1.user", "com.pin1.location", "com.pin1.post"})
public class Pin1Application {

	public static void main(String[] args) {
		SpringApplication.run(Pin1Application.class, args);
	}

}
