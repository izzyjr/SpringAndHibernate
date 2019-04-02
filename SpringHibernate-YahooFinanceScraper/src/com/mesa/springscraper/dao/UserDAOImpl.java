package com.mesa.springscraper.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mesa.springscraper.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {
	
	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void createUserAccount(User theUser) {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		//save the user
		currentSession.save(theUser);
	}

}
