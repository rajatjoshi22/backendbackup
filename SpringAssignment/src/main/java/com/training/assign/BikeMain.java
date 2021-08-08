package com.training.assign;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BikeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext("com.training");
		Bike bike=context.getBean(Bike.class);
		bike.setModel("duke390");
		bike.setPrice(250000.0);
		System.out.println(bike);
	}

}
