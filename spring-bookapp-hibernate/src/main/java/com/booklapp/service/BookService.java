package com.booklapp.service;

import java.util.List;

import com.booklapp.exceptions.BookIdNotFoundException;
import com.booklapp.exceptions.BookNotFoundException;
import com.booklapp.model.Book;

public interface BookService {
public void addBook(Book book) ;
public void  deleteBook(Integer bookId) throws BookIdNotFoundException;
public void  updateBook(Integer bookId,Double Price);
public List<Book> getAllBooks();
public List<Book> getByChoice(String choice) throws BookNotFoundException;
public Book getById(Integer bookId) throws BookIdNotFoundException;
}
