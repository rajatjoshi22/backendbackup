package com.movieapp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
@Table(name="SpringMUser")
public class User {
	@Id
	@Column(name="loginid",length =40)
private String loginId;
	@Column(length = 20)
private String password;
@Column(name="username",length = 20)
private String userName;
@Column(name="mobileno",length = 20)
private Long mobileNumber;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="addressid")
private Address address;

}
