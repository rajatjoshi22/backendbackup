package com.movieapp.service;

import java.util.List;

import com.movieapp.model.Order;

public interface OrderService {
	public void addOrder(Order order);
	public List<Order> findByLoginId(String loginId);
	public void deleteByMovieId(Integer movieId);
	
	public void deleteOrder(Integer orderId);
}
