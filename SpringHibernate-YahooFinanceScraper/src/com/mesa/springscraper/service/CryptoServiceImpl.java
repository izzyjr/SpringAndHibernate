package com.mesa.springscraper.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mesa.springscraper.dao.CoinDAO;
import com.mesa.springscraper.dao.UserDAO;
import com.mesa.springscraper.entity.Coin;
import com.mesa.springscraper.entity.User;

@Service
public class CryptoServiceImpl implements CryptoService {
	
	// need to inject coin dao
	@Autowired
	private CoinDAO coinDAO;
	
	// need to inject user dao
	@Autowired
	private UserDAO userDAO;

	@Override
	@Transactional
	public List<Coin> getCoins() {
		return coinDAO.getCoins();
	}

	@Override
	@Transactional
	public void createUserAccount(User theUser) {
		
		userDAO.createUserAccount(theUser);
	}

	@Override
	@Transactional
	public User loginUser(User theUser) {
		
		User validated = userDAO.loginUser(theUser);
		return validated;
		
	}

}
