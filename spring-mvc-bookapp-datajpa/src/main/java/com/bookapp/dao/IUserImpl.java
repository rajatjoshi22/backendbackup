package com.bookapp.dao;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookapp.model.User;
@Repository
public class IUserImpl implements IUser {

	
	@Autowired
	SessionFactory factory;
	
	@Override
	public void userSignup(User user) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(user);
		transaction.commit();
		session.close();
	}

	@Override
	public User userLogin(String loginId, String password) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
      String sql="from User where loginId like:id and password like:pass";
      Query<User> query=session.createQuery(sql);
      query.setParameter("id",loginId);
      query.setParameter("pass", password);
      User user=query.uniqueResult();
      session.close();
      return user;
		
		
	}
	@Override
	public User getUserById(String loginId) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		User user=session.get(User.class,loginId);
		session.close();
		return user;
		
	}
	@Override
	public void savePassword(String loginId, String password) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		User user=session.get(User.class,loginId);
		user.setPassword(password);
		session.save(user);
		transaction.commit();
		session.close();
	}

}
