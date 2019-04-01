package com.mesa.springscraper.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mesa.springscraper.dao.CoinDAO;
import com.mesa.springscraper.entity.Coin;

@Service
public class CryptoServiceImpl implements CryptoService {
	
	// need to inject coin dao
	@Autowired
	private CoinDAO coinDAO;

	@Override
	@Transactional
	public List<Coin> getCoins() {
		return coinDAO.getCoins();
	}

}
