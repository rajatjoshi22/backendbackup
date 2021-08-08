package com.training.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmpSpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext context=new AnnotationConfigApplicationContext("com.training"); 
     
//      Employee employee=(Employee)context.getBean("employee");
//      
      Employee employee=context.getBean("employee",Employee.class);
      
      
//      Employee employee=context.getBean(Employee.class);
      System.out.println(employee);
	}

}
