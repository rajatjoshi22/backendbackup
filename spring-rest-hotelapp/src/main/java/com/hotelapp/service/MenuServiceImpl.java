package com.hotelapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelapp.model.Menu;
import com.hotelapp.repository.MenuDao;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	MenuDao menuRepository;
	@Override
	public Menu getById(Integer menuId) {
		// TODO Auto-generated method stub
		return menuRepository.findById(menuId).get();
	}

	@Override
	public void addMenu(Menu menu) {
		// TODO Auto-generated method stub
		menuRepository.save(menu);
	}

}
