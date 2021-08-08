package com.studentapp.model;

import org.springframework.stereotype.Component;


public class Student {
 private String studentName;
 private Integer studentId;
 private String city;
 private Long mobileNumber;
 
public Student() {
	super();
	
}
public Student(String studentName, Integer studentId, String city, Long mobileNumber) {
	super();
	this.studentName = studentName;
	this.studentId = studentId;
	this.city = city;
	this.mobileNumber = mobileNumber;
}
public Long getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(Long mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public Integer getStudentId() {
	return studentId;
}
public void setStudentId(Integer studentId) {
	this.studentId = studentId;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Student [studentName=" + studentName + ", city=" + city + ", mobileNumber="
			+ mobileNumber + "]";
}
 
 
}
