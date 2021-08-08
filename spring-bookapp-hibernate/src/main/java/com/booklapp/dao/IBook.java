package com.booklapp.dao;

import java.util.List;

import com.booklapp.model.Book;

public interface IBook {
public void addBook(Book book);
public void  deleteBook(Integer bookId);
public void updateBook(Integer bookId,Double Price);
public List<Book> getAllBooks();
public List<Book> getByChoice(String choice);
public Book getById(Integer bookId);
}
