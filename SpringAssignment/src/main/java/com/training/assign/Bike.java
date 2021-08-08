package com.training.assign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike {
String model;
Double price;
Features features;
Insurance insurance;
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}

public Features getFeatures() {
	return features;
}
@Autowired
public void setFeatures(Features features) {
	this.features = features;
}
public Insurance getInsurance() {
	return insurance;
}
@Autowired
public void setInsurance(Insurance insurance) {
	this.insurance = insurance;
}
@Override
public String toString() {
	return "Bike [model=" + model + ", price=" + price + ", features=" + features + ", insurance=" + insurance + "]";
}

}
