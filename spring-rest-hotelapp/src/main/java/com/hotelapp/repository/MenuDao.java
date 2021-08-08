package com.hotelapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hotelapp.model.Hotel;
import com.hotelapp.model.Menu;

@Repository
public interface MenuDao extends JpaRepository<Menu, Integer> {
	@Query()
	public List<Hotel> getByMenuName(String menuname);
}
