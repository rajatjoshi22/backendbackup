package com.movieapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="SpringMMovie")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Movie {	
@Column(name="moviename",length = 20)
private String movieName;
@Column(length=20)
private Double ratings;
@Id
@Column(name="movieid",length = 20)
private Integer movieId;
@Column(length = 20)
private String language;
private String genre;

@Column(name="imagepath")
private String imagePath;

@Column(name="agecriteria")
private String ageCriteria;
private String description;

private String duration;

@Column(length=20)
private String director;
@Column(length=20)
private String actor;
@Column(length=20)
private String actress;
@Column(length=20)
private String day;
@Column(length=20)
private Double price;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="theatreid")
private Theatre theatre;
public Movie(String movieName, Double ratings, String language, String director, String actor, String actress,
		String date, Double price) {
	super();
	this.movieName = movieName;
	this.ratings = ratings;
	this.language = language;
	this.director = director;
	this.actor = actor;
	this.actress = actress;
	this.day = date;
	this.price = price;
}


}
