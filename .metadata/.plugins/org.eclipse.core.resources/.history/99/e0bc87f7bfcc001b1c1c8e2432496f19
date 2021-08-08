package com.movieapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieapp.model.Movie;
import com.movieapp.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieRepository movieRepository;
	
	@Override
	public void addMovie(Movie movie) {
		
     movieRepository.save(movie);
	}

	@Override
	public void deleteMovie(Integer movieId) {
		// TODO Auto-generated method stub
		movieRepository.deleteById(movieId);
	}

	@Override
	public Movie getByMovieId(Integer movieId) {
		// TODO Auto-generated method stub
		return movieRepository.findById(movieId).orElse(null);
	}

	@Override
	public List<Movie> getByChoice(String choice) {
		// TODO Auto-generated method stub
		return movieRepository.findByChoice(choice);
	}

	@Override
	public List<Movie> findByGenreName(String genreName) {
		// TODO Auto-generated method stub
		return movieRepository.findByGenre(genreName);
	}

	@Override
	public List<Movie> findAllMovie() {
		// TODO Auto-generated method stub
		List<Movie> movieList= movieRepository.findAll();
		System.out.println(movieList);
		return movieList;
	}

	@Override
	public List<Movie> findByLanguage(String language) {
		// TODO Auto-generated method stub
		return movieRepository.findByLanguage(language);
	}

	@Override
	public void updateMovie(Movie movie) {
		movieRepository.save(movie);
		
	}

}
