package com.studentapp.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.studentapp.model.Student;
@Repository
public class IStudentimpl implements IStudent {
 
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void setDatasource(DataSource datasource) {
		jdbcTemplate.setDataSource(datasource);
	}
	

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		String sql="insert into springstudent values(?,?,?,?)";
		Object[] studentArray= {student.getStudentName(),student.getStudentId(),student.getCity(),student.getMobileNumber()};
        jdbcTemplate.update(sql,studentArray);
	}

	@Override
	public void updateStudent(Integer studentId, Long mobileNumber) {
		// TODO Auto-generated method stub
		String sql="update springstudent set mobileNumber=? where studentId=?";
		Object[] studentArray= {mobileNumber,studentId};
		jdbcTemplate.update(sql,studentArray);

	}

	@Override
	public List<Student> getAllStudents() {
	
		// TODO Auto-generated method stub
		String sql="select * from springstudent";
		List<Student> studentList=jdbcTemplate.query(sql, new StudentMapper());
		return studentList;
		
		
	}

	@Override
	public void deleteStudent(Integer studentId) {
		// TODO Auto-generated method stub
     String sql="delete from springstudent where studentId=?";
     jdbcTemplate.update(sql,studentId);
	}

	@Override
	public List<Student> getStudentByCity(String city) {
		// TODO Auto-generated method stub
		String sql="select * from springstudent where city=?";
		List<Student> studentList=jdbcTemplate.query(sql,(rs,rowNum)->{
				// TODO Auto-generated method stub
				
				
					Student student=new Student();
					student.setStudentName(rs.getString(1));
					student.setStudentId( rs.getInt(2));
					student.setCity(rs.getString(3));
					student.setMobileNumber(Long.parseLong(rs.getString(4)));
					return student;	
				
				
				
			},city);
		return studentList;
	}

	@Override
	public Student getStudentById(Integer studentId) {
		// TODO Auto-generated method stub
		 String sql = "SELECT * FROM springstudent WHERE studentId = ?";
		
//		 return jdbcTemplate.queryForObject(sql, (rs, rowNum) ->
//         new Student(
//                 rs.getString(1),
//                 rs.getInt(2),
//                 rs.getString(3),
//                 Long.parseLong(rs.getString(4))
//         ),studentId);
	     Student student=(Student)jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(Student.class),studentId);
            return student;
           		 

}


	@Override
	public String getNameById(Integer studentId) {
		// TODO Auto-generated method stub
		String sql="select studentName from springstudent where studentId=?";
		String name=jdbcTemplate.queryForObject(sql,String.class,studentId);
		return name;
		
	}
	}
