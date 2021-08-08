package com.hotelapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelapp.exceptions.HotelNotFoundException;
import com.hotelapp.model.Hotel;
import com.hotelapp.model.Menu;
import com.hotelapp.repository.HotelDao;
@Service
@Transactional
public class HotelServiceImpl implements HotelService {

	@Autowired
	HotelDao hotelRepository;
	
	@Override
	public Hotel addHotel(Hotel hotel) {
	
			hotelRepository.save(hotel);
		
		     return hotel;

	}

	@Override
	public void deleteHotel(Integer hotelid) {
		hotelRepository.deleteById(hotelid);

	}

	

	@Override
	public Hotel getById(Integer hotelid) {
		// TODO Auto-generated method stub
		return  hotelRepository.findById(hotelid).get();
	}

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return hotelRepository.findAll();
	}

	@Override
	public List<Hotel> getByCuisine(String cuisineName) {
		// TODO Auto-generated method stub
		List<Hotel> hotelList= hotelRepository.findByCuisinelistCuisineName(cuisineName);
		if(hotelList.isEmpty()) {
			throw new HotelNotFoundException("No Hotel found having this cuisine");
		}
		return hotelList;
		
	}

	@Override
	public List<Hotel> getByCity(String city) {
		// TODO Auto-generated method stub
		return hotelRepository.findByAddressCity(city);
	}

	

	@Override
	public List<Hotel> getByPriceLower(Double price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> getByReviews(String reviews) {
		// TODO Auto-generated method stub
		return hotelRepository.findByReviews(reviews);
	}

	@Override
	public List<Hotel> getByCategory(String category) {
		// TODO Auto-generated method stub
		return hotelRepository.findByMenulistCategory(category);
	}



	@Override
	public void updateHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		Hotel hotel1=hotelRepository.findById(hotel.getHotelId()).get();
		hotel1.setReviews(hotel.getReviews());
		hotelRepository.save(hotel1);
	}

	@Override
	public List<Hotel> getByMenuName(String menuname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> getByTypeandMenuName(String type, String nemuname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Menu> getByHotelName(String hotelname) {
		// TODO Auto-generated method stub
		return null;
	}

}
