package com.pin1.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController{
	@RequestMapping(value="/")
	public static String index() {
		return "Chal gya re...";
	}
}