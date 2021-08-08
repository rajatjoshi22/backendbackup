package com.furniture.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furniture.models.Type;
import com.furniture.repository.TypeRepository;

@Service
public class TypeServiceImpl implements TypeService {

	@Autowired
	TypeRepository typeRepository;
	
	@Override
	public void addtype(Type type) {
		// TODO Auto-generated method stub
     typeRepository.save(type);
	}

	@Override
	public Type getById(Integer typeId) {
		// TODO Auto-generated method stub
		return typeRepository.findById(typeId).orElse(null);
	}

}
