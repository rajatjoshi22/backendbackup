package com.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productapp.dao.IProduct;
import com.productapp.model.Product;
@Service
public class ProductServiceImpl implements ProductService {

	 @Autowired
	 IProduct productDao;
	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productDao.getAllProduct();
	}

	@Override
	public List<Product> getProductByCategory(String category) {
		// TODO Auto-generated method stub
		return productDao.getProductByCategory(category);
	}

	@Override
	public List<Product> getProductByCatandBrand(String category, String brand) {
		// TODO Auto-generated method stub
		return productDao.getProductByCatandBrand(category, brand);
	}

	@Override
	public void updateProduct(Integer productId, Double price) {
		// TODO Auto-generated method stub
        productDao.updateProduct(productId, price);
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub

		 productDao.addProduct(product);
	}

	@Override
	public void deleteProduct(Integer productId) {
		// TODO Auto-generated method stub
         productDao.deleteProduct(productId);
	}

	@Override
	public List<Product> getProductByPriceLessThan(Double price) {
		// TODO Auto-generated method stub
		return productDao.getProductByPriceLessThan(price);
	}

	@Override
	public Product getProductById(Integer productId) {
		// TODO Auto-generated method stub
		return productDao.getProductById(productId);
	}

}
