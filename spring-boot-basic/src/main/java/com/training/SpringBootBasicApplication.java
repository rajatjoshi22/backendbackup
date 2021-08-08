package com.training;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

import com.training.constructor.Student;
import com.training.javabased.Book;
import com.training.setter.Employee;

@SpringBootApplication
//@ComponentScan(basePackages= {"com.shristi","com.training"})
public class SpringBootBasicApplication implements CommandLineRunner {

	public static void main(String[] args) {
		System.out.println("hello");
		SpringApplication.run(SpringBootBasicApplication.class, args);
	}
   
	 @Autowired
	 Employee employee;
	 @Autowired
	 Student student;
	 
	 @Autowired
	 Book book;
	 @Autowired
	 ApplicationContext context;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(employee);
		Employee emp=context.getBean(Employee.class);
		System.out.println(emp);
		System.out.println(student);
		System.out.println(book);
//		Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
