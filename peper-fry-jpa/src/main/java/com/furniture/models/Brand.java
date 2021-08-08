package com.furniture.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name="springbrand")
@Data
public class Brand {

	@Column(name="brandname")
	private String brandName;
	
	@Id
	@Column(name="brandid")
	 @GeneratedValue(generator = "brandseq1",strategy =GenerationType.SEQUENCE )
    @SequenceGenerator(name = "brandseq1",sequenceName = "brand_seq1",initialValue = 51,allocationSize = 1)
	private Integer brandId;
	
	@JsonIgnore
	@OneToMany(mappedBy = "brand")
	private Set<Product> productList;

	@Override
	public String toString() {
		return "Brand [brandName=" + brandName + "]";
	}
}
