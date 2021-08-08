package com.hotelapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hotelapp.model.Address;
import com.hotelapp.model.Cuisine;
import com.hotelapp.model.Hotel;
import com.hotelapp.model.Menu;
import com.hotelapp.service.CuisineService;
import com.hotelapp.service.HotelService;
import com.hotelapp.service.MenuService;

@SpringBootApplication
public class SpringRestHotelappApplication implements  CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringRestHotelappApplication.class, args);
	}

	@Autowired
	HotelService hotelService;
	@Autowired
	CuisineService cuisineService;
	@Autowired
	MenuService menuService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
//		Hotel hotel=hotelService.getById(1);
//		Menu menu1=menuService.getById(21);
//		Menu menu2=menuService.getById(22);
//		Menu menu3=menuService.getById(23);
//		menu1.setHotel(hotel);
//		menuService.addMenu(menu1);
//		menu2.setHotel(hotel);
//		menuService.addMenu(menu2);
//		menu3.setHotel(hotel);
//		menuService.addMenu(menu3);
		
//		Address address=new Address("StreetCity","Gurugram",33890);
//		Menu menu1=new Menu();
//		menu1.setMenuName("chilli chicken");
//		menu1.setCategory("starter");
//		menu1.setPrice(250.0);
//		menu1.setType("nonveg");
//		Menu menu2=new Menu();
//		menu2.setMenuName("Irish platter");
//		menu2.setCategory("main course");
//		menu2.setPrice(350.0);
//		menu2.setType("veg");
//		Menu menu3=new Menu();
//		menu3.setMenuName("Turkish platter");
//		menu3.setCategory("maincourse");
//		menu3.setPrice(250.0);
//		menu3.setType("veg");
//		Set<Menu> menuList=new HashSet<>(Arrays.asList(menu1,menu2,menu3));
//		Cuisine cuisine1=new Cuisine("Chinese");
//		Cuisine cuisine2=new Cuisine("Irish food");
//		Cuisine cuisine3=new Cuisine("Turkish food");
//		cuisineService.addCuisine(cuisine1);
//		cuisineService.addCuisine(cuisine2);
//		cuisineService.addCuisine(cuisine3);
//		Set<Cuisine> cuList=new HashSet<>(Arrays.asList(cuisine1,cuisine2,cuisine3));
//	   Hotel hotel=new Hotel("PQR Hotel","Excellent",cuList,address,menuList);
//	   hotelService.addHotel(hotel);
		List<Hotel> hotelList=hotelService.getByCity("Gurugram");
		for(Hotel hotel:hotelList) {
			System.out.println(hotel);
		}
		hotelList=hotelService.getByCuisine("Chinese");
		for(Hotel hotel:hotelList) {
			System.out.println(hotel);
		}
		
		hotelList=hotelService.getByReviews("Excellent");
		for(Hotel hotel:hotelList) {
			System.out.println(hotel);
		}
		hotelList=hotelService.getByCategory("starter");
		for(Hotel hotel:hotelList) {
			System.out.println(hotel);
		}
		
	}

}
