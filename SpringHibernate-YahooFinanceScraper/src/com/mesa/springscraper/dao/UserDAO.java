package com.mesa.springscraper.dao;

import com.mesa.springscraper.entity.User;

public interface UserDAO {
	
	public void createUserAccount(User theUser);
	public User loginUser(User theUser);

}
