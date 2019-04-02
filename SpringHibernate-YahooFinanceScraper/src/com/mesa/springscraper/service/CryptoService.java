package com.mesa.springscraper.service;

import java.util.List;

import com.mesa.springscraper.entity.Coin;
import com.mesa.springscraper.entity.User;

public interface CryptoService {
	
	public List<Coin> getCoins();
	public void createUserAccount(User theUser);

}
