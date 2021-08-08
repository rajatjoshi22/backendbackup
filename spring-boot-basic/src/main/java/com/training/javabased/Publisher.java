package com.training.javabased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "pubOne")
//@Component
public class Publisher {
private String publisherName;
private Integer totalCopies;
public String getPublisherName() {
	return publisherName;
}
//@Value(value="capcom")
public void setPublisherName(String publisherName) {
	this.publisherName = publisherName;
}
public Integer getTotalCopies() {
	return totalCopies;
}
//@Value(value="123")
public void setTotalCopies(Integer totalCopies) {
	this.totalCopies = totalCopies;
}
@Override
public String toString() {
	return "Publisher [publisherName=" + publisherName + ", totalCopies=" + totalCopies + "]";
}

}
