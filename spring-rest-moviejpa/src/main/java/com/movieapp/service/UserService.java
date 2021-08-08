package com.movieapp.service;

import com.movieapp.model.User;

public interface UserService {

	public void userSignup(User user);
    public User userLogin(String loginId,String password);
    public User getUserById(String loginId);
     public void updateUser(User user);
}
