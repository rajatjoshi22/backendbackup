package com.movieapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieapp.model.Cart;
import com.movieapp.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartRepository cartRepository;
	
	@Override
	public void addToCart(Cart cart) {
		// TODO Auto-generated method stub
      cartRepository.save(cart);
	}

	@Override
	public void deleteByMovieMovieId(Integer movieId) {
		// TODO Auto-generated method stub
		
		cartRepository.removeByMovieMovieId(movieId);
	}

	@Override
	public List<Cart> getByLoginId(String loginId) {
		// TODO Auto-generated method stub
		return  cartRepository.findByLoginId(loginId);
	}

}
