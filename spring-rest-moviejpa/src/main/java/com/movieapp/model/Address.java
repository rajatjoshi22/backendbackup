package com.movieapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="SpringMAddress")
public class Address {

	@Id
	@Column(name="addressid")
	@GeneratedValue(generator = "addressseq",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "addressseq",sequenceName = "address_seq",initialValue=90,allocationSize = 1)
	private Integer addressId;
	private String state;
	private String city;
	
	private Integer zipcode;
}
