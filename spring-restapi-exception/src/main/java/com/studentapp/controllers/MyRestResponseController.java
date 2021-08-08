package com.studentapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.studentapp.model.Student;
import com.studentapp.service.StudentService;

@RestController
public class MyRestResponseController {
	@Autowired
	StudentService studentService;
@GetMapping("getAllStudent")
public ResponseEntity<List<Student>> getAllStudent(){
	List<Student> studentList= studentService.getAllStudent();
	ResponseEntity<List<Student>> entity=new ResponseEntity<>(studentList,HttpStatus.OK);
	return entity;
}
@GetMapping("/getStudentByCity")
public ResponseEntity<List<Student>> getStudentByCity(@RequestParam("city")String city){
	
	List<Student> studentList= studentService.getStudentByCity(city);
	return ResponseEntity.ok(studentList);
}
@GetMapping("/getStudentwithId")
public ResponseEntity<Student> getStudentById(@RequestParam("studentId")Integer studentId){
	
	Student student=studentService.getStudentbyId(studentId);
	HttpHeaders header=new HttpHeaders();
	header.add("detail","Student with this id found");
	return new ResponseEntity(student,header,HttpStatus.ACCEPTED);
}
@PostMapping("/students")
 public ResponseEntity<Student> addStudent(@RequestBody Student student) {
	HttpHeaders header=new HttpHeaders();
	header.add("details","passing one student details!!!");
	return ResponseEntity.status(HttpStatus.ACCEPTED).headers(header).body(student);
}
@GetMapping("/getStudentStartWith")
public ResponseEntity<List<Student>> getStudentStartWith(@RequestParam("start")String start){
	
	HttpHeaders header=new HttpHeaders();
	header.add("details","Students found with that name are:");
	header.add("greet","Have a great day ahead");
	List<Student> studentList= studentService.getStudentStartWith(start);
	return ResponseEntity.status(HttpStatus.ACCEPTED).headers(header).body(studentList);
}

}
