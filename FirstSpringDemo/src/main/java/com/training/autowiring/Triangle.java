package com.training.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape {

	@Override
	public void calculateArea(int x, int y) {
		// TODO Auto-generated method stub
		 int area=(x*y)/2;
		 System.out.println("area of the triangle:"+area);
	}

}
