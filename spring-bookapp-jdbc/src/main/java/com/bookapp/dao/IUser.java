package com.bookapp.dao;

import com.bookapp.model.User;

public interface IUser {
	public int  userSignup(User user);
	public User userLogin(String loginId,String password);
	public User getUserById(String loginId);
	public int savePassword(String loginId,String password);
}
