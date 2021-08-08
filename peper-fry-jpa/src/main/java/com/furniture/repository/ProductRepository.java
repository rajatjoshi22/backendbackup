package com.furniture.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.furniture.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

public List<Product> findByTypeType(String type);
public List<Product> findByBrandBrandName(String brandName);

@Query("from Product where type.category.categoryName=:categoryName and type.type=:type" )
public List<Product> findByCatAndType(String categoryName,String type );

@Query("from Product where type.category.categoryName=:categoryName")
public List<Product> findByCategory(String categoryName);
	
@Query("from Product where type.type=:type and price<:price")
public List<Product> findByTypeAndPrice(String type,Double price);

}
