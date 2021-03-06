package com.booklapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="springbook")
public class Book {
private String bookTitle;
@Id
private Integer bookId;
private String bookCategory;
private String bookAuthor;
private Double bookPrice;
}
