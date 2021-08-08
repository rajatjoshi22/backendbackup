package com.furniture.services;

import com.furniture.models.Brand;

public interface BrandService {

	public void addBrand(Brand brand);
	public Brand getById(Integer brandId);
}
