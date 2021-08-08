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
@Data
@Table(name="springcategory")
public class Category {
    @Column(name="categoryname")
	private String categoryName;
    @Id
    @Column(name="categoryid")
    @GeneratedValue(generator = "catseq1",strategy =GenerationType.SEQUENCE )
    @SequenceGenerator(name = "catseq1",sequenceName = "cat_seq1",initialValue = 21,allocationSize = 1)
     private Integer categoryId;
    
    @JsonIgnore
    @OneToMany(mappedBy = "category")
    private Set<Type> typeList;

	@Override
	public String toString() {
		return "Category [categoryName=" + categoryName + "]";
	}
    
    
}
