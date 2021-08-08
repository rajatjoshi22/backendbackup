package com.movieapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movieapp.model.Cart;

@Service
public interface CartService {

	
	public void addToCart(Cart cart);
	
	public void deleteByMovieMovieId(Integer movieId);
	
	public List<Cart> getByLoginId(String loginId);
}
