package com.training.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	String city;
	 Integer zipcode;
	 
	public Address() {
	System.out.println("Address constructor");
	}
	public String getCity() {
		return city;
	}
	@Value(value = "Delhi")
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getZipcode() {
		return zipcode;
	}
	@Value(value = "123456")
	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", zipcode=" + zipcode + "]";
	}
	 
}
