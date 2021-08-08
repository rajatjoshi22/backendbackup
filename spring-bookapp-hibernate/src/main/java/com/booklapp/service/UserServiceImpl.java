package com.booklapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booklapp.dao.IUser;
import com.booklapp.exceptions.UserAlreadyExistException;
import com.booklapp.exceptions.UserNotFoundException;
import com.booklapp.model.User;
@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	IUser userDao;
	@Override
	public void userSignup(User user) {
		// TODO Auto-generated method stub
		try {
		 userDao.userSignup(user);
		 }catch(Exception e) {
			 throw new UserAlreadyExistException("User Already Exist");
		 }
	}

	@Override
	public User userLogin(String loginId, String password) {
		// TODO Auto-generated method stub
		User user= userDao.userLogin(loginId, password);
		if(user==null) {
			throw new UserNotFoundException("Invalid login credentials!!!");
		}
		return user;
	}

	@Override
	public User getUserById(String loginId) {
		// TODO Auto-generated method stub
		return userDao.getUserById(loginId);
	}

	@Override
	public void savePassword(String loginId, String password) {
		// TODO Auto-generated method stub
		  userDao.savePassword(loginId, password);
	}

}
