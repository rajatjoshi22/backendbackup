package com.hotelapp.service;

import com.hotelapp.model.Cuisine;

public interface CuisineService {
public Cuisine getById(Integer cuisineId);
public void addCuisine(Cuisine cuisine);
}
