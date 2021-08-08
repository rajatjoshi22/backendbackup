package com.bookapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bookapp.model.User;
@Repository
public class IUserImpl implements IUser {

	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public void setDatasource(DataSource datasource) {
		jdbcTemplate.setDataSource(datasource);
	}
	@Override
	public int userSignup(User user) {
		// TODO Auto-generated method stub
		String sql="insert into springuser values(?,?,?,?)";
		Object[] arr= {user.getLoginId(),user.getPassword(),user.getUserName(),Long.toString(user.getMobileNumber())};
		int result=jdbcTemplate.update(sql,arr);
		return result;
	}

	@Override
	public User userLogin(String loginId, String password) {
		// TODO Auto-generated method stub
		String sql="select * from springuser where loginId=? and password=?";
		Object[] arr= {loginId,password};
		User user=null;
		List<User> list=jdbcTemplate.query(sql,new RowMapper<User>(){

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				return new User(rs.getString(1),rs.getString(2),rs.getString(3),Long.parseLong(rs.getString(4)));
			}
			
		},arr);
		
		for(User users:list ) {
			user=users;
		}
		return user;
		
		
	}
	@Override
	public User getUserById(String loginId) {
		// TODO Auto-generated method stub
		String sql="select * from springuser where loginId=?";
		User user=null;
		List<User> list=jdbcTemplate.query(sql,new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
		      return new User(rs.getString(1),rs.getString(2),rs.getString(3),Long.parseLong(rs.getString(4)));
			}
			
		},loginId);
		for(User users:list ) {
			user=users;
		}
		return user;
		
	}
	@Override
	public int savePassword(String loginId, String password) {
		// TODO Auto-generated method stub
		String sql="update springuser set password=? where loginId=?";
		Object[] arr= {password,loginId};
		int result=jdbcTemplate.update(sql,arr);
		return result;
	}

}
