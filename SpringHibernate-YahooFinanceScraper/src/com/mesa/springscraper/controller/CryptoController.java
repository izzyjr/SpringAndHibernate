package com.mesa.springscraper.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mesa.springscraper.dao.CoinDAO;
import com.mesa.springscraper.entity.Coin;

@Controller
@RequestMapping("/coin")
public class CryptoController {
	
	// need to inject the coin DAO
	@Autowired
	private CoinDAO coinDAO;

	@RequestMapping("/list")
	public String listCoins(Model theModel) {
		
		// get coins from the DAO
		List<Coin> theCoins = coinDAO.getCoins();
		
		// add the coins to the model
		theModel.addAttribute("coins", theCoins);
		
		return "list-coins";
	}
	
}
