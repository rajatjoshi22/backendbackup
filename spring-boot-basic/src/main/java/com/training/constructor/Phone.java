package com.training.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Phone {
Long phoneNumber;
String type;

public Phone() {
	super();
	// TODO Auto-generated constructor stub
	System.out.println("Phone constructor");
}
public Long getPhoneNumber() {
	return phoneNumber;
}
@Value(value = "${phone.phoneNumber}")
public void setPhoneNumber(Long phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getType() {

	return type;
}
@Value(value = "${phone.type}")
public void setType(String type) {
	this.type = type;
}
@Override
public String toString() {
	return "Phone [phoneNumber=" + phoneNumber + ", type=" + type + "]";
}

}
