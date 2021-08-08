package com.booklapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booklapp.dao.IBook;
import com.booklapp.exceptions.BookAlreadyExistException;
import com.booklapp.exceptions.BookIdNotFoundException;
import com.booklapp.exceptions.BookNotFoundException;
import com.booklapp.model.Book;
@Service
public class BookServiceImpl implements BookService {

//	@Autowired
//	BookDao bookDao;
	@Autowired
	IBook bookDao;
	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		try {
     bookDao.addBook(book);
		}catch(Exception e) {
			
			throw new BookAlreadyExistException("Book with this id already exist");
		}
	}

	@Override
	public void deleteBook(Integer bookId) {
		// TODO Auto-generated method stub
		try {
		bookDao.deleteBook(bookId);
		}catch(Exception e) {
			throw new BookIdNotFoundException("invalid book Id!!!!");
		}
		
	}

	@Override
	public void updateBook(Integer bookId, Double Price) {
		// TODO Auto-generated method stub
		bookDao.updateBook(bookId, Price);
	
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		List<Book> bookList=bookDao.getAllBooks();
		return bookList;
	}

	@Override
	public List<Book> getByChoice(String choice) {
		// TODO Auto-generated method stub
		List<Book> bookList= bookDao.getByChoice(choice);
		if(bookList.isEmpty()) {
			throw new BookNotFoundException("No Books found of your choice");
		}
		return bookList;
	}

	@Override
	public Book getById(Integer bookId) {
		// TODO Auto-generated method stub
		Book book= bookDao.getById(bookId);
		if(book==null) {
			throw new BookIdNotFoundException("Invalid Book Id");
		}
		return book;
	}

}
