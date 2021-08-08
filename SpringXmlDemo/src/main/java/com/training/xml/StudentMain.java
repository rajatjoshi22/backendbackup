package com.training.xml;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     AbstractApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
     Student student=(Student)context.getBean("student");
     System.out.println(student.getStuName());
     System.out.println(student.getStuId());
     System.out.println(student.getAddress());
     context.close();
	}

}
