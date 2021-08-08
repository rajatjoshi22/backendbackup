package com.bookapp.model;

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
public class Book {
private String bookTitle;
private Integer bookId;
private String bookCategory;
private String bookAuthor;
private Double bookPrice;
}
