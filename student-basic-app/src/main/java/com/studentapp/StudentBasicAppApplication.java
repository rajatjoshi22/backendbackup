package com.studentapp;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentapp.model.Student;
import com.studentapp.service.StudentService;

@SpringBootApplication
public class StudentBasicAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentBasicAppApplication.class, args);
	}

	

    
    @Autowired
    StudentService studentService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<Student> studentByCity=studentService.getStudentByCity("Delhi");
		studentByCity.forEach(System.out::println);
		System.out.println();
		Student  student=studentService.getStudentbyId(1993);
		System.out.println(student);
		
		
	}

}
