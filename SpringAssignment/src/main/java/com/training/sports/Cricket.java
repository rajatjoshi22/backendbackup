package com.training.sports;

import org.springframework.stereotype.Component;

@Component
public class Cricket implements Sport {

	public void showEquipments() {
		// TODO Auto-generated method stub
	    String[] accessories= {"bat","ball","wickets","Cricketkit"};
	     System.out.println("Printing cricket accessories");
	     for(String accessory:accessories) {
	    	 System.out.println(accessory);
	     }
	}

}
