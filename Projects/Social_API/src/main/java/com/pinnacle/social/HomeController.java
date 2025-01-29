package com.pinnacle.social;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value="/")
	public String getHome() {
		return "Server is on Home Route";
	}
}
