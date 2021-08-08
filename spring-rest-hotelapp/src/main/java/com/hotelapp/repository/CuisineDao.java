package com.hotelapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelapp.model.Cuisine;

@Repository
public interface CuisineDao extends JpaRepository<Cuisine, Integer> {

}
