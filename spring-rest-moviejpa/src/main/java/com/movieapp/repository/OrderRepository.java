package com.movieapp.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.movieapp.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {

	public List<Order> findByUserLoginId(String loginId);
	
	@Modifying
	@Transactional
	@Query(
			  value = "DELETE FROM SpringMOrder where movie_id =:movieId", 
			  nativeQuery = true)
	public void removeByMovieMovieId( @Param("movieId") Integer movieId);
}
