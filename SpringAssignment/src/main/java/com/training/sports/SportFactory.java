package com.training.sports;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class SportFactory {
@Autowired
@Qualifier(value="cricket")
Sport csport;
@Autowired
Sport ssport;
@Autowired
@Qualifier(value = "esports")
Sport esport;

public void showSport(String choice) {
	if(choice.equals("c")) {
		System.out.println("about cricket");
		System.out.println("11 players present in a team || 22 players 3 umpires ");
		csport.showEquipments();
	}else if(choice.equals("s")) {
		System.out.println("about snooker||rectengular table with green cloth");
		System.out.println("2 players");
		ssport.showEquipments();
	}else  if(choice.equals("e")) {
		System.out.println("about esports");
		System.out.println("100 players|| one server");
		esport.showEquipments();
	}else {
		System.out.println("wrong choice");
	}
}
}
