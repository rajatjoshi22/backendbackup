package com.bookapp.dao;

import java.util.List;

import com.bookapp.model.Book;

public interface IBook {
public void addBook(Book book);
public int  deleteBook(Integer bookId);
public int  updateBook(Integer bookId,Double Price);
public List<Book> getAllBooks();
public List<Book> getByChoice(String choice);
public Book getById(Integer bookId);
}
