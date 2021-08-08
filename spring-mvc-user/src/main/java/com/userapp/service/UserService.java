package com.userapp.service;

import java.util.List;

import com.userapp.model.User;

public interface UserService {
 public boolean validateUser(User user);
 public List<String> showItems(String catagory); 
 public List<String> showAll(); 
}
