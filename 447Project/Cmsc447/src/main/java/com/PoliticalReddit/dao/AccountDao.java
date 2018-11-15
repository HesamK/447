package com.PoliticalReddit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.PoliticalReddit.Entity.User;

@Component
public class AccountDao {

	//autowired so it can create the session factory by itself
	@Autowired
	private SessionFactory sessionFactory;
	
	//transactional to manage transaction by it self
	@Transactional
	public void createUser(User user) {
		
		System.out.println("inside create user "+ user.getUserName());
		
		//from hibernates
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
		
	}
	
}
