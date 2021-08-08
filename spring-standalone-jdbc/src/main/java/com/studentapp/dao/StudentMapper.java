package com.studentapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.studentapp.model.Student;

public class StudentMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		
			String userName=rs.getString(1);
			Integer studentId=rs.getInt(2);
			String city=rs.getString(3);
			Long mobileNumber=Long.parseLong(rs.getString(4));
			Student student=new Student(userName,studentId,city,mobileNumber);
			return student;
		
		
		
	}

}
