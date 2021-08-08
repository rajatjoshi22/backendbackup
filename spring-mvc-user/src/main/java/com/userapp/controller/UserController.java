package com.userapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.userapp.model.User;
import com.userapp.service.UserService;

@Controller
public class UserController {

@GetMapping("/")
public String home() {
	return "home";
}


@GetMapping("/loginForm")
public String loginForm() {
	return "loginform";
}
@Autowired
UserService service;
//@PostMapping("/login")
@RequestMapping(value="/login",method = RequestMethod.POST)
public String loginUser(@ModelAttribute User user,BindingResult result,Model model) {
	if(result.hasErrors()) {
		System.out.println(result.getAllErrors());
		return "loginform";
	}else {
		boolean result1=service.validateUser(user);
		if(!result1) {
			model.addAttribute("errormessage","Wrong Details");
			return "loginform";
		}
		
	}
	List<String> product=service.showAll();
	model.addAttribute("product",product);
	return "successpage";
}

@GetMapping("/showItems")
public String showItems(@RequestParam("catagory")String catagory,Model model) {
	List<String> product=service.showItems(catagory);
	if(product.isEmpty()) {
		model.addAttribute("message","No product found");
		return "showproduct";
	}
	model.addAttribute("product",product);
	return "showproduct";
}
}
