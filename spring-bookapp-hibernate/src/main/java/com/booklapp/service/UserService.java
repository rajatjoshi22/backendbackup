package com.booklapp.service;

import com.booklapp.exceptions.UserAlreadyExistException;
import com.booklapp.exceptions.UserNotFoundException;
import com.booklapp.model.User;

public interface UserService {
public void  userSignup(User user) throws UserAlreadyExistException;
public User userLogin(String loginId,String password) throws UserNotFoundException;
public User getUserById(String loginId);
public void savePassword(String loginId,String password);
}
