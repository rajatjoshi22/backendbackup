package com.training.autowiring;


import java.util.Iterator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     Shape shape=new Square();
//     ShapeFactory factory=new ShapeFactory();
//     factory.setShape(shape);
//     factory.printArea();
//     shape=new Rectangle();
//     factory.setShape(shape);
//     factory.printArea();
//     shape=new Triangle();
//     factory.setShape(shape);
//     factory.printArea();
		
		
		
	AbstractApplicationContext context=new AnnotationConfigApplicationContext("com.training.autowiring");	
    		 ShapeFactory factory=context.getBean(ShapeFactory.class);
	         String choice="r";
    		 factory.printArea(choice,10,20);
    		 
    		 String[] beans=context.getBeanDefinitionNames();
    		 for (int i = 0; i < beans.length; i++) {
				String string = beans[i];
				System.out.println(string);
				
			}
	         context.close();
     
	}

}
