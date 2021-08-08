package com.productapp.model;

public class Product {
private Integer productId;
private String productName;
private String productBrand;
private Double price;
private String category;

public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(Integer productId, String productName, String productBrand, Double price, String category) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productBrand = productBrand;
	this.price = price;
	this.category = category;
}
public Integer getProductId() {
	return productId;
}
public void setProductId(Integer productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductBrand() {
	return productBrand;
}
public void setProductBrand(String productBrand) {
	this.productBrand = productBrand;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", productBrand=" + productBrand
			+ ", price=" + price + ", category=" + category + "]";
}

}
