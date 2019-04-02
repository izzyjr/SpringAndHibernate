package com.mesa.springscraper.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mesa.springscraper.entity.Coin;
import com.mesa.springscraper.entity.User;
import com.mesa.springscraper.service.CryptoService;

@Controller
@RequestMapping("/coin")
public class CryptoController {
	
	// need to inject crypto service
	@Autowired
	private CryptoService cryptoService;
	
	// welcome page
	@GetMapping("/welcome")
	public String welcome() {
		return "home-page";
	}
	
	// login page
	@GetMapping("/login")
	public String login() {
		return "login-page";
	}
	
	// create account form
	@GetMapping("/createAccountForm")
	public String createAccountForm(Model theModel) {
		
		// create model attribute to bind form data
		User theUser = new User();
		theModel.addAttribute("user", theUser);
		
		return "create-account";
	}
	
	@PostMapping("/createUserAccount")
	public String createUserAccount(@ModelAttribute("user") User theUser) {
		
		// create user using service
		cryptoService.createUserAccount(theUser);
		
		return "redirect:/coin/login";
	}

	@GetMapping("/list")
	public String getCoins(Model theModel) {
		
		// get coins from the service
		List<Coin> theCoins = cryptoService.getCoins();
		
		// add the coins to the model
		theModel.addAttribute("coin_list", theCoins);
		
		return "list-coins";
	}
	
}
