package com.training.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape {
     
	@Override
	public void calculateArea(int x, int y) {
		// TODO Auto-generated method stub
      int area=x*y;
      System.out.println("Area for rectangle:"+area);
	}

}
