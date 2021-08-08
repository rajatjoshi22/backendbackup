package com.booklapp.dao;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.booklapp.model.Book;
@Repository
public class IBookImpl implements IBook {

	@Autowired
	SessionFactory factory;
	
	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(book);
		transaction.commit();
		session.close();
	}

	@Override
	public void deleteBook(Integer bookId) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Book book=session.get(Book.class, bookId);
		session.delete(book);
		transaction.commit();
		session.close();
	}

	@Override
	public void updateBook(Integer bookId, Double Price) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Book book=session.get(Book.class, bookId);
		book.setBookPrice(Price);
		session.update(book);
		transaction.commit();
		session.close();
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		String sql="from Book";
		List<Book> bookList=session.createQuery(sql).list();
		session.close();
		return bookList;
	}

	@Override
	public List<Book> getByChoice(String choice) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		String sql="from Book b where b.bookTitle Like:btitle or b.bookCategory like:bcat or b.bookAuthor like:baut ";
		Query<Book> query=session.createQuery(sql);
		query.setParameter("btitle","%"+choice+"%");
		query.setParameter("bcat","%"+choice+"%");
		query.setParameter("baut","%"+choice+"%");
		List<Book> bookList=query.list();
		session.close();
		return bookList;
		
	}

	@Override
	public Book getById(Integer bookId) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
//		Transaction transaction=session.beginTransaction();
		Book book=session.get(Book.class, bookId);
		session.close();
		return book;
	}
	


}
