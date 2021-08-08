package com.furniture.services;

import com.furniture.models.Category;

public interface CategoryService {

	public void addCategory(Category category);
	public Category findbyId(Integer categoryId);
}
