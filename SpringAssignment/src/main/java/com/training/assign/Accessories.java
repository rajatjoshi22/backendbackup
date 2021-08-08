package com.training.assign;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Accessories {
String name;
double price;
public String getName() {
	return name;
}
@Value(value = "Mirrors")
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
@Value(value="1200.0")
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Accessories [name=" + name + ", price=" + price + "]";
}


}
