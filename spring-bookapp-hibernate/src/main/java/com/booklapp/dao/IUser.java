package com.booklapp.dao;

import com.booklapp.model.User;

public interface IUser {
	public void  userSignup(User user);
	public User userLogin(String loginId,String password);
	public User getUserById(String loginId);
	public void savePassword(String loginId,String password);
}
