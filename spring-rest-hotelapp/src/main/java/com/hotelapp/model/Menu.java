package com.hotelapp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;

import lombok.Setter;

@Entity
@Getter
@Setter
public class Menu {
	@Column(name="menuname")
private String menuName;

@Id
@GeneratedValue(generator = "menuseq",strategy = GenerationType.SEQUENCE)
@SequenceGenerator(name = "menuseq",sequenceName = "menu_seq",initialValue=21,allocationSize = 1)
@Column(name="menuid")
private Integer menuId;
private Double price;
@Column(length =10)
private String type;
@Column(length =15)
private String category;
@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name="hotel_id",referencedColumnName = "hotelId")
@JsonIgnore
private Hotel hotel;

public Menu() {
	super();
	// TODO Auto-generated constructor stub
}

public Menu(String menuName, Double price, String type, String category) {
	super();
	this.menuName = menuName;
	this.price = price;
	this.type = type;
	this.category = category;
}




}
