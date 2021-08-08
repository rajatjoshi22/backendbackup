package com.userapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.userapp.model.User;
@Service
public class UserServiceImpl implements UserService {
   
	private String[] users= {"Rajat","Raju","Roman","Dwayn"};
	private String password="user1234";
	String[] electronics= {"mobile","earphone","headphone"};
	String[] sports= {"bat","ball","tennisracket","football"};
	String[] clothes= {"shirt","trouser","T-shirt"};
	@Override
	public boolean validateUser(User user) {
		// TODO Auto-generated method stub
		int userflag=0;
		int passwordflag=0;
		for(String userr:users) {
			if(userr.equals(user.getLoginId())) {
				userflag=1;
			    break;
			}
		}
		
		
		if(userflag==1) {
			if(user.getPassword().equals(password)) {
				passwordflag=1;
			}
		}
		
		if(userflag==1 && passwordflag==1) {
			return true;
		}
		return false;
		
	}

	@Override
	public List<String> showItems(String catagory) {
		// TODO Auto-generated method stub
		
		List<String> product=new ArrayList<>();

		if(catagory.equals("electronics")) {
			for(String prod:electronics) {
				product.add(prod);
			}
		}else if(catagory.equals("sports")) {
			for(String prod:sports) {
				product.add(prod);
			}
		}else {
			for(String prod:clothes) {
				product.add(prod);
			}
		}
		return product;
		
		
	}

	@Override
	public List<String> showAll() {
		// TODO Auto-generated method stub
		List<String> product=new ArrayList<>();
		for(String prod:electronics) {
			product.add(prod);
		}
		for(String prod:sports) {
			product.add(prod);
		}
		for(String prod:clothes) {
			product.add(prod);
		}
		return product;
		
	}
	
	

}
