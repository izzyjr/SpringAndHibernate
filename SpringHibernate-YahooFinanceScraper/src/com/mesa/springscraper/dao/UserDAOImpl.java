package com.mesa.springscraper.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
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

	@Override
	public User loginUser(User theUser) {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// check if username and password belong to a user in DB
		Query<User> theQuery = currentSession.createQuery("FROM User "
													+ " WHERE username = :username "
													+ " and password = :password", User.class);
	    theQuery.setParameter("username", theUser.getUsername());
	    theQuery.setParameter("password", theUser.getPassword());
	    
	    List<User> userList = theQuery.getResultList();
	    if (userList.isEmpty()) {
	    	return null;
	    }
	    
	    return theUser = userList.get(0);
	}

}
