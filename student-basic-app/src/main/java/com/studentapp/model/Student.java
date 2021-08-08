package com.studentapp.model;
public class Student {
 private String studentName;
 private Integer studentId;
 private String city;
public Student(String studentName, Integer studentId, String city) {
	super();
	this.studentName = studentName;
	this.studentId = studentId;
	this.city = city;
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
	return "Student [studentName=" + studentName + ", studentId=" + studentId + ", city=" + city + "]";
}
 
 
}
