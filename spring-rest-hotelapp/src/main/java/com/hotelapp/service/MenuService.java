package com.hotelapp.service;

import com.hotelapp.model.Menu;

public interface MenuService {
	public Menu getById(Integer menuId);
	public void addMenu(Menu menu);
}
