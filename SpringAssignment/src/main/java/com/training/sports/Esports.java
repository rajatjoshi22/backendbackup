package com.training.sports;

import org.springframework.stereotype.Component;

@Component
public class Esports implements Sport {

	public void showEquipments() {
		// TODO Auto-generated method stub
 
		 String[] accessories= {"SmartPhone","Internet"};
	     System.out.println("Printing Esports accessories");
	     for(String accessory:accessories) {
	    	 System.out.println(accessory);	
		
	}
	}
}
