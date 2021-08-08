package com.movieapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.movieapp.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer> {
      
	@Query("from Movie m inner join m.theatre t where m.movieName like:choice or m.language like:choice or t.city like:choice")
	public List<Movie> findByChoice(String choice);
	
	public List<Movie> findByGenre(String genreName);
	
	public List<Movie> findByLanguage(String language);
}
