package com.training.xml;

public class Student {
String stuName;
Integer stuId;
Address address;

public Student(Address address) {
	
	this.address = address;
}
public String getStuName() {
	return stuName;
}
public void setStuName(String stuName) {
	this.stuName = stuName;
}
public Integer getStuId() {
	return stuId;
}
public void setStuId(Integer stuId) {
	this.stuId = stuId;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [stuName=" + stuName + ", stuId=" + stuId + "]";
}

}
