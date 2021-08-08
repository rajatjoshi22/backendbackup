package com.training.sports;

import org.springframework.stereotype.Component;

@Component(value = "ssport")
public class Snooker implements Sport {

	

	public void showEquipments() {
		// TODO Auto-generated method stub
	    String[] accessories= {"Snookertable","snookerballs","snookerStick"};
	     System.out.println("Printing Snooker accessories");
	     for(String accessory:accessories) {
	    	 System.out.println(accessory);	
	}
	}

}
