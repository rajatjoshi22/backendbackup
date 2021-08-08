package com.movieapp.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.movieapp.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart,Integer> {

	public List<Cart> findByLoginId(String loginId);
	@Modifying
	@Transactional
	@Query(
			  value = "DELETE FROM SpringMCart where movieId =:movieId", 
			  nativeQuery = true)
	public void removeByMovieMovieId( @Param("movieId") Integer movieId);


}
