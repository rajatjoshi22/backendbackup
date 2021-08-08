package com.studentapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentapp.model.Student;
import com.studentapp.service.StudentService;

@SpringBootApplication
public class SpringStandaloneJdbcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringStandaloneJdbcApplication.class, args);
	}
 
	@Autowired
	StudentService studentService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Student student=new Student("Rohan",173,"Delhi",9457530575L);
//		studentService.addStudent(student);
//		studentService.updateStudent(163,9410401175L);
//		studentService.deleteStudent(173);
//		System.out.println(studentService.getStudentById(163));
//		List<Student> studentList=studentService.getAllStudents();
//		for(Student student:studentList) {
//			System.out.println(student);
//		}
//		
//		studentList=studentService.getStudentByCity("Delhi");
//		for(Student student:studentList) {
//			System.out.println(student);
//		}
		
		System.out.println(studentService.getStudentById(163));
		
//		System.out.println(studentService.getNameById(163));
	}

}
