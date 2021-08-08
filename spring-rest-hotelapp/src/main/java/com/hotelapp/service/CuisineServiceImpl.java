package com.hotelapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelapp.model.Cuisine;
import com.hotelapp.repository.CuisineDao;
@Service
public class CuisineServiceImpl implements  CuisineService {

@Autowired
CuisineDao cuisineRepository;
	@Override
	public Cuisine getById(Integer cuisineId) {
		// TODO Auto-generated method stub
		return cuisineRepository.findById(cuisineId).get();
	}
	@Override
	public void addCuisine(Cuisine cuisine) {
		// TODO Auto-generated method stub
		cuisineRepository.save(cuisine);
	}

}
