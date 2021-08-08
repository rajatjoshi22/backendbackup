package com.productapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.productapp.model.Product;
import com.productapp.service.ProductService;

@SpringBootApplication
public class SpringProductJdbcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringProductJdbcApplication.class, args);
	}
	
	
	@Autowired
	
	ProductService service;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Product product=new Product(133,"Mobile Phone","Apple",21000.0,"Gadgets");
//		service.addProduct(product);
//		service.updateProduct(133,25000.0);
//		service.deleteProduct(133);
		service.getAllProduct().forEach(System.out::println);
		service.getProductByCategory("Gadgets").forEach(System.out::println);
		service.getProductByCatandBrand("Gadgets","Samsung").forEach(System.out::println);
		service.getProductByPriceLessThan(21001.0).forEach(System.out::println);
		System.out.println(service.getProductById(123));
	}

}
