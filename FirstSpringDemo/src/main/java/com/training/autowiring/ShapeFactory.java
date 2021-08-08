package com.training.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {
	@Autowired
	@Qualifier(value ="rectangle")
	Shape rshape;
	@Autowired
	@Qualifier(value ="square")
	Shape sshape;
	@Autowired
	@Qualifier(value ="triangle")
	Shape tshape;
  


	public void printArea(String choice,int x,int y) {
		if(choice.equals("r")) {
		System.out.println("printing area");
		rshape.calculateArea(x,y);
		}else if(choice.equals("s")){
			System.out.println("printing area");
			sshape.calculateArea(x,y);
		}else if(choice.equals("t")) {
			System.out.println("printing area");
			tshape.calculateArea(x,y);
		}else {
			System.out.println("Wrong choice");
		}
	}
	
}
