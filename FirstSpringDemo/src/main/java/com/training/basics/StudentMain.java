package com.training.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context=new AnnotationConfigApplicationContext("com.training");
		 Student student=context.getBean(Student.class);
		 System.out.println(student.getAddress());
		 System.out.println(student.getPhone());
	}

}
