package com.training.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 
public class Book {
private String title;
private String author;
private Publisher publisher;
public String getTitle() {
	return title;
}
@Value(value="Devil may cry")
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
@Value(value="Rajat")
public void setAuthor(String author) {
	this.author = author;
}
public Publisher getPublisher() {
	return publisher;
}
@Autowired
//@Qualifier(value = "pubOne")
public void setPublisher(Publisher publisher) {
	this.publisher = publisher;
}
@Override
public String toString() {
	return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + "]";
}

}
