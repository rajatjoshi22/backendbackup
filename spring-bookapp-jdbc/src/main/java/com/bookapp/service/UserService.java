package com.bookapp.service;

import com.bookapp.model.User;

public interface UserService {
public int  userSignup(User user);
public User userLogin(String loginId,String password);
public User getUserById(String loginId);
public int savePassword(String loginId,String password);
}
