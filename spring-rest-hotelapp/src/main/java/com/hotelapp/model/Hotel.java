package com.hotelapp.model;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Hotel {
	@Id
	@GeneratedValue(generator = "hotelseq",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "hotelseq",sequenceName = "hotel_seq",initialValue=1,allocationSize = 1)
private Integer hotelId;
	@Column(name="hotelname" ,length =20)
private String hotelName;
	@Column(length =20)
private String reviews;
@ManyToMany(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
@JoinTable(name="Hiberhotel_cuisine",joinColumns= {@JoinColumn(name="hotel_id")},inverseJoinColumns = {@JoinColumn(name="cuisine_id")})
private Set<Cuisine> cuisinelist;
@OneToOne(cascade ={CascadeType.ALL})
@JoinColumn(name="address_id")
private Address address;
@OneToMany(mappedBy="hotel",fetch = FetchType.EAGER)
private Set<Menu> menulist;
public Hotel(String hotelName, String reviews, Set<Cuisine> cuisinelist, Address address) {
	super();
	this.hotelName = hotelName;
	this.reviews = reviews;
	this.cuisinelist = cuisinelist;
	this.address = address;
}


}
