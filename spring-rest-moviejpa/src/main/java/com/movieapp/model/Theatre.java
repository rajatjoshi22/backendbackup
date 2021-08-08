package com.movieapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="SpringMTheatre")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Theatre {

	@Id
	@GeneratedValue(generator = "theatremseq",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "theatremseq",sequenceName = "theatrem_seq",initialValue=30,allocationSize = 2)
	@Column(name="theatreid")
	private Integer theatreId;
	@Column(name="theatrename")
	private String theatreName;
	private String state;
	private String city;
	private Integer zipcode;
	public Theatre(String theatreName, String state, String city, Integer zipcode) {
		super();
		this.theatreName = theatreName;
		this.state = state;
		this.city = city;
		this.zipcode = zipcode;
	}
	
	
	
	
}
