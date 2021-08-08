package com.restapp.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class MyController {
	
	@GetMapping("greet")
public String greetMessage() {
	return "Have a great day";
}
	@GetMapping("show/{name}")
	public String printName(@PathVariable("name")String name) {
		return "welcome"+" "+name;
	}
	@GetMapping("showByCity")
	public String printUserName(@RequestParam("city")String city) {
		if(city.equals("Delhi")) {
			return "Chandnichok";
		}
		return "kuch b nahi";
	}
	@GetMapping("show-items")
	public List<String> showAll(){
		return Arrays.asList("Laptop","Mobile","x-box");
	}
	@GetMapping("show-by-type/{type}")
	public List<String> showByType(@PathVariable("type")String type){
		return Arrays.asList("Laptop","Mobile","x-box").stream().filter((item)->item.equals(type)).collect(Collectors.toList());
	}
}
