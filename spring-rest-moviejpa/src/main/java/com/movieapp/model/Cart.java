package com.movieapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="SpringMCart")
@NoArgsConstructor
@Getter
@Setter
public class Cart {
@Id
@Column(name="cartid")
@GeneratedValue(generator = "cartseq",strategy = GenerationType.SEQUENCE)
@SequenceGenerator(name = "cartseq",sequenceName = "cart_seq",initialValue=50,allocationSize = 2)
private Integer cartId;
private String loginId;
@OneToOne
@JoinColumn(name="movieId")
private Movie movie;
}
