package com.training.scope;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PropertySource( value = "classpath:application.properties")
public class User {
String name;
String city;
List<String> bookList=new ArrayList<>();
public List<String> getBookList() {
	return bookList;
}
//@Value(value = "#{'${user.bookList}'.split(',')}")
@Value(value = "#{'java,python,mongodb,angular'.split(',')}")
public void setBookList(List<String> bookList) {
	this.bookList = bookList;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
	System.out.println("user constructor");
}
public String getName() {
	return name;
}
@Value(value="${user.uname}")
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
@Value(value= "${user.city}") 
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "User [name=" + name + ", city=" + city + ", bookList=" + bookList + "]";
}

}
