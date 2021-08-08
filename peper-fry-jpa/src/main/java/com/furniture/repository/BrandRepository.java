package com.furniture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.furniture.models.Brand;
@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {

}
