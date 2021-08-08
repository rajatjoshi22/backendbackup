package com.movieapp;
import com.movieapp.service.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.movieapp.model.Movie;
import com.movieapp.model.Theatre;
import com.movieapp.model.User;
import com.movieapp.service.UserService;

@SpringBootApplication
public class SpringRestMoviejpaApplication implements  CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestMoviejpaApplication.class, args);
	}
	
	
	@Autowired
	UserService userService;
	
	@Autowired
	MovieService movieService;
	
	

	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		User user =new User("rajat421joshi@gmail.com","rajat421","Rajat Joshi",9411671385L);
//		userService.userSignup(user);
	
//	Movie movie =new Movie("Justice League",4.5,"hindi","Zack Snyder","Jared Leto","Millie Bobby Brown","24-05-2021",1400.0);
//	Genre genre1=genreService.findByGenreName("Action");
//	Genre genre2=genreService.findByGenreName("Sci-Fi");
//	Set<Genre> genreList=new HashSet<Genre>(Arrays.asList(genre1,genre2));
//	movie.setGenreList(genreList);
//	
//	Theatre theatre=new Theatre("PVR","Civil lines","Delhi");
//	Theatre theatre1=theatreService.findByTheatreNameAndCity(theatre);
//	
////		
//	movie.setTheatre(theatre1);
//	movieService.addMovie(movie);
		
		
//	Movie movie=movieService.getByMovieId(53);
//	System.out.println(movie);
	
//		List<Movie> movieList=movieService.getByChoice("Delhi");
//		movieList.forEach(System.out::println);
//		
//		System.out.println(movieList.size());
//		
//		
//		movieList=movieService.findByGenreName("Action");
//		movieList.forEach(System.out::println);
//		
//		movieList=movieService.findAllMovie();
//		movieList.forEach(System.out::println);
//	Genre genre=genreService.findByGenreId(21);
//	System.out.println(genre);
//	Genre genre1=genreService.findByGenreName("Action");
//	System.out.println(genre1);
//	
//	Theatre theatre=new Theatre("PVR","Civil lines","Delhi");
//	Theatre theatre1=theatreService.findByTheatreNameAndCity(theatre);
//	System.out.println(theatre1);
//		
//	
//	movieService.deleteMovie(50);
//	System.out.println("movie deleted");
		
//		String loginId="rajat4211joshi@gmail.com";
//		String password="rajat4211";
//		User user=userService.userLogin(loginId, password);
//		System.out.println(user);
	}

}
