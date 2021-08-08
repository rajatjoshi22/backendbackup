package com.studentapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.studentapp.model.Student;
import com.studentapp.service.StudentService;

//@RestController
public class MyRestController {
	@Autowired
	StudentService studentService;
@GetMapping("getAllStudent")
public List<Student> getAllStudent(){
	
	return studentService.getAllStudent();
}
@GetMapping("getStudentByCity")
public List<Student> getStudentByCity(@RequestParam("city")String city){
	
	return studentService.getStudentByCity(city);
}
@GetMapping("getStudentById")
public Student getStudentById(@RequestParam("studentId")Integer studentId){
	
	return studentService.getStudentbyId(studentId);
}
@PostMapping("/students")
 Student addStudent(@RequestBody Student student) {
	return student;
}
@GetMapping("/getStudentStartWith")
public List<Student> getStudentStartWith(@RequestParam("start")String start){
	
	return studentService.getStudentStartWith(start);
}

}
