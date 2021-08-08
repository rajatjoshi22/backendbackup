package com.training.assign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Features {
String mileage;
Accessories accessories;
@Autowired
public Features(Accessories accessories) {
	super();
	this.accessories = accessories;
}
public String getMileage() {
	return mileage;
}
@Value(value="17.8kmpl")
public void setMileage(String mileage) {
	this.mileage = mileage;
}
public Accessories getAccessories() {
	return accessories;
}
public void setAccessories(Accessories accessories) {
	this.accessories = accessories;
}
@Override
public String toString() {
	return "Features [mileage=" + mileage + ", accessories=" + accessories + "]";
}

}
