package com.movieapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieapp.model.Order;
import com.movieapp.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	@Override
	public void addOrder(Order order) {
       orderRepository.save(order);

	}

	@Override
	public List<Order> findByLoginId(String loginId) {
		// TODO Auto-generated method stub
		return orderRepository.findByUserLoginId(loginId);
	}

	@Override
	public void deleteByMovieId(Integer movieId) {
		orderRepository.removeByMovieMovieId(movieId);
		
	}

	@Override
	public void deleteOrder(Integer orderId) {
		orderRepository.deleteById(orderId);
	}

}
