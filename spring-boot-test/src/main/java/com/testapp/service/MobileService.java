package com.testapp.service;

import java.util.List;

import com.testapp.exceptions.MobileNotFoundException;
import com.testapp.model.Mobile;

public interface MobileService {

	List<Mobile> getAll();
	List<Mobile> getByBrand(String brand) throws MobileNotFoundException;
	List<Mobile> getByBrandAndModel(String brand,String model) throws MobileNotFoundException;
	Mobile getById(Integer mobileId) throws MobileNotFoundException;
}
