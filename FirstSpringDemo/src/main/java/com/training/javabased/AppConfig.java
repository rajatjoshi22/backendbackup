package com.training.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
	
@Bean
public Book getBook() {
	return new Book();
}
@Bean
@Primary//helps to select perticular bean
public Publisher getPublisher() {
	
 Publisher pub=new Publisher();
    pub.setPublisherName("Abc publication");
    pub.setTotalCopies(145);
	return pub;
}
}
