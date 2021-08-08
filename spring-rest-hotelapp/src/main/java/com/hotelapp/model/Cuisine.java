package com.hotelapp.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter

@NoArgsConstructor

public class Cuisine {


	@Id
	@GeneratedValue(generator = "cuisineseq",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "cuisineseq",sequenceName = "cuisine_seq",initialValue=41,allocationSize = 1)
   @Column(name="cuisineid")
	private Integer cuisineId;
	@Column(name="cuisinename")
private String cuisineName;

@ManyToMany(mappedBy = "cuisinelist")
@JsonIgnore
private Set<Hotel> hotel;

public Cuisine(String cuisineName) {
	super();
	this.cuisineName = cuisineName;
}

@Override
public String toString() {
	return "Cuisine [cuisineId=" + cuisineId + ", cuisineName=" + cuisineName + "]";
}



}
