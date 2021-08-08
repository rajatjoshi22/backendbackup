package com.movieapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieapp.model.User;
import com.movieapp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	UserRepository userRepository;
	
	
	@Override
	public void userSignup(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	public User userLogin(String loginId, String password) {
		// TODO Auto-generated method stub
		return userRepository.userLogin(loginId, password);
	}

	@Override
	public User getUserById(String loginId) {
		// TODO Auto-generated method stub
		return userRepository.findById(loginId).orElse(null);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
		
	}

	
}
