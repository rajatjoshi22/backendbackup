package com.training.basics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component 
@PropertySource(value = "classpath:application.properties")
public class Student {
String name;
Address address;
Phone phone;

//public Student() {
//	super();
//	// TODO Auto-generated constructor stub
//	System.out.println("student constructor");
//}

@Autowired
public Student(Address address, Phone phone) {
	super();
	this.address = address;
	this.phone = phone;
}
public String getName() {
	return name;
}
@Value(value = "${student.name}")
public void setName(String name) {
	this.name = name;
}
public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}
public Phone getPhone() {
	return phone;
}


public void setPhone(Phone phone) {
	this.phone = phone;
}
@Override
public String toString() {
	return "Student [name=" + name + ", address=" + address + ", phone=" + phone + "]";
}

}
