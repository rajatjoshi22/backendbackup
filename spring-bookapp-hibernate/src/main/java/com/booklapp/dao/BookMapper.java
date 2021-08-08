package com.booklapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.booklapp.model.Book;



public class BookMapper implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		
		Book book=new Book(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getDouble(5));
		return book;
		
		
		
	}

}
