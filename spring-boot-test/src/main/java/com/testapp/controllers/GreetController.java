package com.testapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	@GetMapping(value="/greet")
	public String greetMsg() {
		return "Have a great day";
	}
}
