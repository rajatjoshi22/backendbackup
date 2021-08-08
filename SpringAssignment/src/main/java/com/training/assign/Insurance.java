package com.training.assign;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Insurance {
String type;
Double value;
public String getType() {
	return type;
}
@Value(value="Third party")
public void setType(String type) {
	this.type = type;
}
public Double getValue() {
	return value;
}
@Value(value="12000.0")
public void setValue(Double value) {
	this.value = value;
}
@Override
public String toString() {
	return "Insurance [type=" + type + ", value=" + value + "]";
}

}
