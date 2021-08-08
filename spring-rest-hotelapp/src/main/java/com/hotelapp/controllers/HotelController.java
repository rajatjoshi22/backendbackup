package com.hotelapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.hotelapp.model.Hotel;
import com.hotelapp.service.HotelService;

@Controller
public class HotelController {

	@Autowired
	HotelService hotelService;
	
	@GetMapping("/hotels")
	public ResponseEntity<List<Hotel>> getAllHotels(){
		List<Hotel> hotelList=hotelService.getAllHotels();
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(hotelList);
		
	}
	@PostMapping("/hotel")
	public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel){
		Hotel hotel1=hotelService.addHotel(hotel);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(hotel1);
		
	}
	
	@GetMapping("/hotel-by-cuisine")
	public ResponseEntity<List<Hotel>> hotelByCuisine(@RequestParam("cuisineName")String cuisineName){
		List<Hotel> hotelList=hotelService.getByCuisine(cuisineName);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(hotelList);
	}

	@GetMapping("/hotel-by-city")
	public ResponseEntity<List<Hotel>> hotelByCity(@RequestParam("city")String city){
		List<Hotel> hotelList=hotelService.getByCity(city);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(hotelList);
	}

	@GetMapping("/hotel-by-review")
	public ResponseEntity<List<Hotel>> hotelByReview(@RequestParam("reviews")String reviews){
		List<Hotel> hotelList=hotelService.getByReviews(reviews);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(hotelList);
	}
	@GetMapping("/hotel-by-category")
	public ResponseEntity<List<Hotel>> hotelByCategory(@RequestParam("category")String category){
		List<Hotel> hotelList=hotelService.getByReviews(category);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(hotelList);
	}
	
	
}
