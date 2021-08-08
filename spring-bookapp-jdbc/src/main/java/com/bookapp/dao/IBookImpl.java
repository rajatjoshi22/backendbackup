package com.bookapp.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bookapp.model.Book;
@Repository
public class IBookImpl implements IBook {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public void setDatasource(DataSource datasource) {
		jdbcTemplate.setDataSource(datasource);
	}
	
	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
        String sql="insert into springbook  values(?,?,?,?,?)";
        Object[] array= {book.getBookTitle(),book.getBookId(),book.getBookCategory(),book.getBookAuthor(),book.getBookPrice()};
        jdbcTemplate.update(sql,array);
	}

	@Override
	public int deleteBook(Integer bookId) {
		// TODO Auto-generated method stub
		String sql="delete from springbook where bookId=?";
		int result=jdbcTemplate.update(sql,bookId);
		return result;
	}

	@Override
	public int updateBook(Integer bookId, Double Price) {
		// TODO Auto-generated method stub
		String sql="update springbook set bookPrice=? where bookId=?";
		Object[] arr= {Price,bookId};
		int result=jdbcTemplate.update(sql,arr);
		return result;
		 
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		String sql="select * from springbook";
		List<Book> bookList=jdbcTemplate.query(sql,new BookMapper());
		return bookList;
	}

	@Override
	public List<Book> getByChoice(String choice) {
		// TODO Auto-generated method stub
		String sql="select * from springbook where bookCategory like ? or bookAuthor like ? or bookTitle like ? ";
        Object[] array= {"%"+choice+"%","%"+choice+"%","%"+choice+"%"};
        List<Book> bookList=jdbcTemplate.query(sql,new BookMapper(),array);
		return bookList;
	}

	@Override
	public Book getById(Integer bookId) {
		// TODO Auto-generated method stub
		String sql="select * from springbook where bookId=?";
		Book book=null;
//		Book book=(Book)jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Book.class),bookId);
		List<Book> list=jdbcTemplate.query(sql,new BookMapper(),bookId);
	    for(Book books:list) {
	    	book=books;
	    }
		return book;
	}

}
