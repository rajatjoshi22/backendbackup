package com.furniture.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name="springfurniture")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Product {
@Column(name="productname")
private String productName;
@Id
@Column(name="productid")
@GeneratedValue(generator = "productseq1",strategy =GenerationType.SEQUENCE )
@SequenceGenerator(name = "productseq1",sequenceName = "product_seq1",allocationSize = 1)
private Integer productId;
private Double price;

@ManyToOne
@JoinColumn(name="type_id")
private Type type;

@ManyToOne
@JoinColumn(name="brand_id")
private Brand brand;
private String description;
@Column(name="imagepath")
private String imagePath;
private Double ratings;
public Product(String productName, Integer productId, Double price, String description, String imagePath,
		Double ratings) {
	super();
	this.productName = productName;
	this.productId = productId;
	this.price = price;
	this.description = description;
	this.imagePath = imagePath;
	this.ratings = ratings;
}


}
