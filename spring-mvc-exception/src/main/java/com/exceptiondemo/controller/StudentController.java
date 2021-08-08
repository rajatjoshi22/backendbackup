package com.exceptiondemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.exceptiondemo.exceptions.CityNotFoundException;
import com.exceptiondemo.exceptions.IdNotFoundException;
import com.exceptiondemo.model.Student;
import com.exceptiondemo.service.StudentService;

@Controller
@SessionAttributes("message")
public class StudentController {
	@Autowired
	StudentService studentService;
	
@GetMapping("/")
public String home(Model model) {
	List<Student> studentList=studentService.showAllStudents();
	model.addAttribute("studentList",studentList);
	return "home";
}

@GetMapping("/getByCity")
public String getByCity(@RequestParam("city")String city,Model model) {
List<Student> studentList=studentService.getStudentByCity(city);
model.addAttribute("studentList",studentList);
return "redirect:/";
}
@GetMapping("/getById")
public String getByCity(@RequestParam("studentId")Integer studentId,Model model) {
Student student=studentService.getStudentbyId(studentId);
if(student.getStudentName().equals("Rajat")) {
	throw new RuntimeException("Invalid Name");
}
model.addAttribute("student",student);
return "home";
}

@ExceptionHandler(CityNotFoundException.class)
public String handleCityException(CityNotFoundException e,Model model) {
	model.addAttribute("message",e.getMessage());
	return "home";
}

}
