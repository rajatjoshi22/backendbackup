package com.hotelapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelapp.model.Hotel;

@Repository
public interface HotelDao extends JpaRepository<Hotel, Integer>  {

	List<Hotel> findByAddressCity(String city);
	List<Hotel> findByCuisinelistCuisineName(String cuisineName);
	List<Hotel> findByReviews(String review);
	List<Hotel> findByMenulistCategory(String category);
	Hotel findByhotelName(String hotelname);
	
}
