package com.bookapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.dao.IUser;
import com.bookapp.model.User;
@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	IUser userDao;
	@Override
	public int userSignup(User user) {
		// TODO Auto-generated method stub
		return userDao.userSignup(user);
	}

	@Override
	public User userLogin(String loginId, String password) {
		// TODO Auto-generated method stub
		return userDao.userLogin(loginId, password);
	}

	@Override
	public User getUserById(String loginId) {
		// TODO Auto-generated method stub
		return userDao.getUserById(loginId);
	}

	@Override
	public int savePassword(String loginId, String password) {
		// TODO Auto-generated method stub
		return userDao.savePassword(loginId, password);
	}

}
