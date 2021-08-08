package com.furniture.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furniture.models.Category;
import com.furniture.repository.*;

@Service
public class CategoryServiceImpl implements CategoryService {


 @Autowired
 CategoryRepository categoryRepository;
 
	@Override
	public void addCategory(Category category) {
		// TODO Auto-generated method stub
      categoryRepository.save(category);   
	}

	@Override
	public Category findbyId(Integer categoryId) {
		// TODO Auto-generated method stub
		return categoryRepository.findById(categoryId).orElse(null);
	}

}
