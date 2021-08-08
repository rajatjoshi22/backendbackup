package com.furniture.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.furniture.models.Product;
import com.furniture.services.ProductService;

@RestController
@RequestMapping("/pepper-api")
public class ProductController {

	@Autowired
	ProductService productService;
	@PostMapping("/product")
	public String addProduct(@RequestBody Product product) {
		productService.addProduct(product);
		return "Product added Successfully";
	}
	
	@DeleteMapping("/product")
	public String deleteProduct(@RequestParam("productId")Integer productId) {
		productService.deleteProduct(productId);
		return "product deletion successfull";
	}
	
	@PutMapping("/product")
	public String updateProduct(@RequestBody Product product) {
		productService.updateProduct(product);
		return "product updated successfully";
	}
	
	@GetMapping("/products")
	public List<Product> getAll(){
		return productService.getAll();
	}
	 
	@GetMapping("/products-by-cat")
	public List<Product> getByCategory(@RequestParam("categoryName")String categoryName){
		return productService.getByCategory(categoryName);
	}
	@GetMapping("/products-by-cat-type")
	public List<Product> getByCatAndType(@RequestParam("categoryName")String categoryName,@RequestParam("type")String type){
		return productService.getByCatAndType(categoryName, type);
	}
	@GetMapping("/products-by-brand")
	public List<Product> getByBrand(@RequestParam("brandName")String brandName){
		return productService.getByBrand(brandName);
	}
}
