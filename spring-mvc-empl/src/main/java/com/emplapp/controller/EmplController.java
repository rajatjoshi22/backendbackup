package com.emplapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.emplapp.model.Employee;

@Controller
public class EmplController {
@GetMapping("/")
public String home() {
	return "index";
}


@GetMapping("/showForm")
public String showForm() {
	return "addempform";
}
//
//@GetMapping("/addEmployee")
//public String addEmployee(@RequestParam("empName")String name,@RequestParam("empId")Integer Id,@RequestParam("empCity")String city,ModelMap model){
//	Employee employee=new Employee();
//	employee.setEmpName(name);
//	employee.setEmpId(Id);
//	employee.setEmpCity(city);
//	model.addAttribute("employee",employee);
//	return "addsuccess";
//	
//}

//@GetMapping("/addEmployee")
//public String addEmployee(@ModelAttribute Employee employee){
//	System.out.println(employee);
//	return "addsuccess";
//	
//}

@GetMapping("/addEmployee")
public String addEmployee(@ModelAttribute Employee employee,BindingResult result){
	System.out.println(employee.getEmpName());
	System.out.println(employee.getEmpId());
	System.out.println(employee.getEmpCity());
	if(result.hasErrors()) {
		System.out.println(result.getAllErrors());
		return "addempform";
	}
	return "addsuccess";
	
}
}
