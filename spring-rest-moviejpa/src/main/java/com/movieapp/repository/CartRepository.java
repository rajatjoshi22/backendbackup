package com.movieapp.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.movieapp.model.Cart;
import com.movieapp.model.Movie;

@Repository
public interface CartRepository extends JpaRepository<Cart,Integer> {

	@Query("from Cart where movie.movieId like:movieId and loginId like:loginId")
	public Cart findByMovieMovieIdAndLoginId(Integer movieId,String loginId);
	public List<Cart> findByLoginId(String loginId);
	@Modifying
	@Transactional
	@Query(
			  value = "DELETE FROM SpringMCart c where c.movie_Id =:movieId", 
			  nativeQuery = true)
	public void removeByMovieMovieId( @Param("movieId") Integer movieId);


}
