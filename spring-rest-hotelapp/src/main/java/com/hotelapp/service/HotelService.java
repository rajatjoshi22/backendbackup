package com.hotelapp.service;

import java.util.List;

import com.hotelapp.model.Hotel;
import com.hotelapp.model.Menu;

public interface HotelService {
public Hotel addHotel(Hotel hotel);
public void deleteHotel(Integer hotelid);
public void updateHotel(Hotel hotel);
public  Hotel getById(Integer hotelid);
public List<Hotel> getAllHotels();
public List<Hotel> getByCuisine(String cuisineName);
public List<Hotel> getByCity(String city);
public List<Hotel> getByMenuName(String menuname);
public List<Hotel> getByPriceLower(Double price);
public List<Hotel> getByReviews(String reviews);
public List<Hotel> getByCategory(String category);
public List<Hotel> getByTypeandMenuName(String type,String nemuname);
public List<Menu>  getByHotelName(String hotelname);



}
