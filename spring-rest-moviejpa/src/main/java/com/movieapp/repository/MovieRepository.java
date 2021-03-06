package com.movieapp.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.movieapp.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer> {
      
	@Query("from Movie where theatre.city like:choice or genre like:choice or language like:choice or actor like:choice or actress like:choice")
	public List<Movie> findByChoice(String choice);
	
	public List<Movie> findByGenre(String genreName);
	
	public List<Movie> findByLanguage(String language);
	
	public List<Movie> findByTheatreCity(String city);
}
