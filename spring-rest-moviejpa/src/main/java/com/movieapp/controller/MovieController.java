package com.movieapp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movieapp.model.Cart;
import com.movieapp.model.Movie;
import com.movieapp.model.Order;
import com.movieapp.service.CartService;
import com.movieapp.service.MovieService;
import com.movieapp.service.OrderService;

@RestController
@RequestMapping("/movie-api")
@CrossOrigin("http://localhost:4500")
public class MovieController {

	@Autowired
	MovieService movieService;
	
	@Autowired
	OrderService orderService;
	
	
	@Autowired
	CartService cartService;
	
	 @PostMapping("/movie")
		public String addMovie(@RequestBody Movie movie) {
			
	            movieService.addMovie(movie);
	            return "movie added successfully";
			
		}
	@GetMapping("/movies")
	public List<Movie> getAllMovies(){
		return movieService.findAllMovie();
	}
	
	@GetMapping("/movie")
	public Movie getById(@RequestParam("movieId")Integer movieId) {
		return movieService.getByMovieId(movieId);
	}
	
	@GetMapping("/movies-by-genre")
	public List<Movie> moviebyGenre(@RequestParam("genreName")String genreName){
		return movieService.findByGenreName(genreName);
	}
	
	@GetMapping("/movies-by-language")
	public List<Movie> moviebyLanguage(@RequestParam("language")String language){
		return movieService.findByLanguage(language);
	}
	
	@GetMapping("/movies-by-city")
	public List<Movie> moviebyCity(@RequestParam("city")String city){
		return movieService.findByCity(city);
	}
	
	
	@DeleteMapping("/movie")
	public String deleteMovie(@RequestParam("movieId")Integer movieId) {
		cartService.deleteByMovieMovieId(movieId);
		orderService.deleteByMovieId(movieId);
		movieService.deleteMovie(movieId);
		return "movie deleted successfully ";
	
	}
	@PostMapping("/order")
	public String addOrder(@RequestBody Order order) {
		orderService.addOrder(order);
		return "Order Added Successfully";
	}
	
	@PostMapping("/cart")
	public String addToCart(@RequestBody Cart cart) {
		cartService.addToCart(cart);
		return "Added successfully";
	}
	
	
	@DeleteMapping("/order")
	public String deleteOrder(@RequestParam("orderId") Integer orderId) {
		orderService.deleteOrder(orderId);
		return "OrderDeleted Successfully";
	}
	
	@PutMapping("/movie")
	public String updateMovie(@RequestBody Movie movie) {
		movieService.updateMovie(movie);
		return "update Successfull";
	}
	
	
@GetMapping("/movies-by-choice")
public List<Movie> getByChoice(@RequestParam("choice")String choice){
	return movieService.getByChoice(choice);
}
	
}
