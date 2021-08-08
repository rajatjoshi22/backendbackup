package com.productapp.dao;

import java.util.List;

import com.productapp.model.Product;

public interface IProduct {

	List<Product> getAllProduct();
	List<Product> getProductByCategory(String category);
	List<Product> getProductByCatandBrand(String category,String brand );
	void updateProduct(Integer productId,Double price);
	void addProduct(Product product);
	void deleteProduct(Integer productId);
	List<Product> getProductByPriceLessThan(Double price);
	Product getProductById(Integer productId);
}
