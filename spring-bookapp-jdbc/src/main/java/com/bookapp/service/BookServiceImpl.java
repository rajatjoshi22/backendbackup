package com.bookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.bookapp.dao.BookDao;
import com.bookapp.dao.IBook;
import com.bookapp.model.Book;
@Service
public class BookServiceImpl implements BookService {

//	@Autowired
//	BookDao bookDao;
	@Autowired
	IBook bookDao;
	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
     bookDao.addBook(book);
	}

	@Override
	public int deleteBook(Integer bookId) {
		// TODO Auto-generated method stub
		int result=bookDao.deleteBook(bookId);
		return result;
		
	}

	@Override
	public int updateBook(Integer bookId, Double Price) {
		// TODO Auto-generated method stub
		int result=bookDao.updateBook(bookId, Price);
		return result;
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
		return bookDao.getByChoice(choice);
	}

	@Override
	public Book getById(Integer bookId) {
		// TODO Auto-generated method stub
		return  bookDao.getById(bookId);
	}

}
