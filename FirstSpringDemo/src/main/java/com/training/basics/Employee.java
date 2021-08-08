package com.training.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
 String empName;
 Integer empId;

 Address address;
public String getEmpName() {
	return empName;
}
@Value(value = "Rajat")
public void setEmpName(String empName) {
	this.empName = empName;
}
public Integer getEmpId() {
	return empId;
}
@Value(value = "165")
public void setEmpId(Integer empId) {
	this.empId = empId;
}
public Address getAddress() {
	return address;
}
@Autowired
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Employee [empName=" + empName + ", empId=" + empId + ", address=" + address + "]";
}
 
 
}
