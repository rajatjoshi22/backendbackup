package com.furniture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.furniture.models.Brand;
import com.furniture.models.Category;
import com.furniture.models.Product;
import com.furniture.models.Type;
import com.furniture.repository.BrandRepository;
import com.furniture.services.*;

@SpringBootApplication
public class PeperFryJpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PeperFryJpaApplication.class, args);
	}

	@Autowired
	ProductService prodService;
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	BrandService brandService;
	
	@Autowired
	TypeService typeService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside run");
		
		
//		Category category=new Category();
//		category.setCategoryName("Table");
//		categoryService.addCategory(category);
//		
//		category=new Category();
//		category.setCategoryName("Chair");
//		categoryService.addCategory(category);
//		
//		category=new Category();
//		category.setCategoryName("Storage");
//		categoryService.addCategory(category);	
//	Category category=categoryService.findbyId(21);
//	
	Type type1=new Type();	
//	type1.setCategory(category);
//		type1.setType("Side Table");
//	typeService.addtype(type1);
//		
//		 type1=new Type();
//			type1.setCategory(category);
//			type1.setType("Dinning Table");
//			typeService.addtype(type1);
//		
//			
//			 type1=new Type();
//				type1.setCategory(category);
//				type1.setType("Coffee Table");
//				typeService.addtype(type1);
		
		
		Brand brand=new Brand();
//		brand.setBrandName("Durian");
//		brandService.addBrand(brand);
//		
//		brand=new Brand();
//		brand.setBrandName("Adiko Systems");
//		brandService.addBrand(brand);
//		
		
//	Product product=new Product();	
//	product.setProductName("McKaine Solid Wood Coffee Table");
//	product.setRatings(4.5);
//	product.setBrand(brandService.getById(51));
//	product.setType(typeService.getById(66));
//	product.setDescription(" Glass Top In Honey Oak Finish");
//	product.setPrice(4400.0);
//	product.setImagePath("../assets/images/img3.jpg");
//	prodService.addProduct(product);	
		
		prodService.getAll().forEach(System.out::println);
		prodService.getByBrand("Durian").forEach(System.out::println);
		prodService.getByType("Coffee Table").forEach(System.out::println);
		prodService.getByCatAndType("Chair","Cantilever Chair").forEach(System.out::println);
		prodService.getByCategory("Chair").forEach(System.out::println);
		prodService.getByTypeAndLowerPrice("Cantilever Chair",2500.0).forEach(System.out::println);
		
		
	}

}
