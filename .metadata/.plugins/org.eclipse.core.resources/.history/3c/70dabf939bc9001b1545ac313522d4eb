package com.movieapp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movieapp.model.Movie;

import com.movieapp.service.MovieService;

@RestController
@RequestMapping("/movie-api")
@CrossOrigin("http://localhost:4500")
public class MovieController {

	@Autowired
	MovieService movieService;
	
	 @PostMapping("/Movie")
		public String addMovie(@RequestBody Movie movie) {
			
	            movieService.addMovie(movie);
	            return "movie added successfully";
			
		}
	@GetMapping("/Movies")
	public List<Movie> getAllMovies(){
		return movieService.findAllMovie();
	}
	
	@GetMapping("/Movie")
	public Movie getById(@RequestParam("movieId")Integer movieId) {
		return movieService.getByMovieId(movieId);
	}
	
	@GetMapping("/Movies-By-Genre")
	public List<Movie> moviebyGenre(@RequestParam("genreName")String genreName){
		return movieService.findByGenreName(genreName);
	}
	
	@GetMapping("/Movies-By-language")
	public List<Movie> moviebyLanguage(@RequestParam("language")String language){
		return movieService.findByLanguage(language);
	}
	
	@DeleteMapping("/movie")
	public String deleteMovie(@RequestParam("movieId")Integer movieId) {
		movieService.deleteMovie(movieId);
		return "movie deleted successfully ";
	}
}
