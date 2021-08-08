package com.furniture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.furniture.models.Type;

public interface TypeRepository extends JpaRepository<Type, Integer> {

}
