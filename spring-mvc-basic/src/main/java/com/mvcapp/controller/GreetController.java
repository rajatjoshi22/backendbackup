package com.mvcapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetController {
@RequestMapping("/greet")
public String greetMessage(Model model) {
	model.addAttribute("message","Have a great day");
	return "success";
	
}


@RequestMapping("/greetPeople")
public String greetPeople(ModelMap model) {
	model.addAttribute("message", "Hello People");
	model.addAttribute("message2","second message");
	return "success";
}


@RequestMapping("/show")
public ModelAndView show() {
	return new ModelAndView("success","message","show method");
}

}
