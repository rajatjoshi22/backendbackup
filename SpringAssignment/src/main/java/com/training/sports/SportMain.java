package com.training.sports;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SportMain {
public static void main(String[] args) {
	AbstractApplicationContext context=new AnnotationConfigApplicationContext("com.training.sports");
    SportFactory factory=context.getBean(SportFactory.class);
    Scanner src=new Scanner(System.in);
    System.out.println("Enter c|s|e");
    String choice=src.next();
    factory.showSport(choice);
    context.close();
    src.close();


}
}
