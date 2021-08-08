package com.training.scope;


import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    AbstractApplicationContext context=new AnnotationConfigApplicationContext("com.training.scope");
    User user1=context.getBean(User.class);
    System.out.println("user1: "+user1.getName());
    System.out.println(user1);
    List<String> bookList=user1.getBookList();
    for(String book:bookList) {
    	System.out.println(book);
    }
    
    User user2=context.getBean(User.class);
    System.out.println("user2: "+user2.getName());
    user2.setName("Dragon");
    System.out.println("user2:"+user2.getName());
    System.out.println("user1:"+user1.getName());
    context.close();
	}

}
