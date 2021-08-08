package com.training.javabased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    AbstractApplicationContext context=new AnnotationConfigApplicationContext("com.training.javabased");
	Book book=context.getBean("getBook",Book.class);
		System.out.println(book);
		context.close();
		String[] beans=context.getBeanDefinitionNames();
		for(String bean:beans) {
			System.out.println(bean);
		}
	}

}
