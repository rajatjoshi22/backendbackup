package com.furniture.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furniture.models.Brand;
import com.furniture.repository.BrandRepository;

@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	BrandRepository brandRepository;
	@Override
	public void addBrand(Brand brand) {
		// TODO Auto-generated method stub
       brandRepository.save(brand);
	}
	@Override
	public Brand getById(Integer brandId) {
		// TODO Auto-generated method stub
		return brandRepository.findById(brandId).orElse(null);
	}

}
