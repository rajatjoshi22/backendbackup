package com.productapp.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.productapp.model.Product;
@Repository
public class IProductImpl implements IProduct {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void setDatasource(DataSource datasource) {
		jdbcTemplate.setDataSource(datasource);
	}
	
	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		String sql="select * from springproduct";
     List<Product> productList=jdbcTemplate.query(sql,new ProductMapper());
	    return productList;
     
     
	}

	@Override
	public List<Product> getProductByCategory(String category) {
		// TODO Auto-generated method stub
		String sql="select * from springproduct where category=?";
	     List<Product> productList=jdbcTemplate.query(sql,new ProductMapper(),category);
		    return productList;
	}

	@Override
	public List<Product> getProductByCatandBrand(String category, String brand) {
		// TODO Auto-generated method stub
		String sql="select * from springproduct where category=? and productBrand=?";
		Object[] arr= {category,brand};
	     List<Product> productList=jdbcTemplate.query(sql,new ProductMapper(),arr);
		    return productList;
	}

	@Override
	public void updateProduct(Integer productId, Double price) {
		// TODO Auto-generated method stub
		
		String sql="update springproduct set price=? where productId=?";
		Object[] arr= {price,productId};
		jdbcTemplate.update(sql,arr);
		
		
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		String sql="insert into springproduct values(?,?,?,?,?)";
		Object[] arr= {product.getProductId(),product.getProductName(),product.getProductBrand(),product.getPrice(),product.getCategory()};
	     jdbcTemplate.update(sql,arr);
	
	}

	@Override
	public void deleteProduct(Integer productId) {
		// TODO Auto-generated method stub
		String sql="delete from springproduct where productId=?";
		jdbcTemplate.update(sql,productId);
	}

	@Override
	public List<Product> getProductByPriceLessThan(Double price) {
		// TODO Auto-generated method stub
		String sql="select * from springproduct where price<?";
	     List<Product> productList=jdbcTemplate.query(sql,new ProductMapper(),price);
		    return productList;
	}

	@Override
	public Product getProductById(Integer productId) {
		// TODO Auto-generated method stub
		String sql="Select * from springproduct where productId=?";
		Product product=(Product)jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(Product.class),productId );
		return product;
		
	}

}
