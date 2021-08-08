package com.movieapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movieapp.model.Cart;
import com.movieapp.model.Movie;
import com.movieapp.model.Order;
import com.movieapp.model.User;
import com.movieapp.service.CartService;
import com.movieapp.service.MovieService;
import com.movieapp.service.OrderService;
import com.movieapp.service.UserService;

@RestController
@RequestMapping("/movie-api")
@CrossOrigin("http://localhost:4500")
public class UserController {

	@Autowired
	UserService userService;
	@Autowired
	OrderService orderService;
	
	@Autowired
	CartService cartService;
	
	@PostMapping("/User")
	public String addUser(@RequestBody User user) {
		 System.out.println(user);
	userService.userSignup(user);
	return "user added successfully";
		 
	}
	 
	
	 @GetMapping("/User")
	 public User loginuser(@RequestParam("loginId")String loginId,@RequestParam("password")String password) {
		 return userService.userLogin(loginId, password);
	 }
	 
	 
	 @GetMapping("/orders")
	 public List<Order> getAllOrders(@RequestParam("loginId")String loginId){
		  return orderService.findByLoginId(loginId);
	 }
	 
	 
	 @GetMapping("/cart")
	 public List<Cart> getAllCart(@RequestParam("loginId")String loginId){
		 return cartService.getByLoginId(loginId);
	 }
	 
	 
	 
}
