package com.mesa.springscraper.dao;

import java.util.List;

import com.mesa.springscraper.entity.Coin;

public interface CoinDAO {
	
	public List<Coin> getCoins();
	public List<Coin> coinScraper();
	public void saveCoins(List<Coin> listCoins);
	public void clearCoinTable();

}
