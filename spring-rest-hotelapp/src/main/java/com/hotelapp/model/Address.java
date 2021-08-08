package com.hotelapp.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Address {
	@Id
	@GeneratedValue(generator = "addressseq",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "addressseq",sequenceName = "address_seq",initialValue=21,allocationSize = 1)
@Column(name="addressid")
	private Integer addressId;
private String  location;
private String city;
private Integer zipcode;
public Address(String location, String city, Integer zipcode) {
	super();
	this.location = location;
	this.city = city;
	this.zipcode = zipcode;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}

}
