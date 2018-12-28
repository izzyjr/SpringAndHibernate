package com.mesa.springdemo;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertiesFileFortunesTwo implements FortuneService {

	@Value("${fortuneOne}")
	private String fortuneOne;
	
	@Value("${fortuneTwo}")
	private String fortuneTwo;
	
	@Value("${fortuneThree}")
	private String fortuneThree;
	
	@Value("${fortuneFour}")
	private String fortuneFour;
	
	@Value("${fortuneFive}")
	private String fortuneFive;
	
	// @PostConstruct annotation is called at the end of the bean lifecycle process.
	@PostConstruct
	public String[] setUpMyData() {
		
		System.out.println("Hello - setUpMyData()");
		
		// Create an array of Strings
		String[] data = {fortuneOne, fortuneTwo, fortuneThree, fortuneFour, fortuneFive};
		
		// return array
		return data;
		
	}
				
	// Create a random number generator
	Random myRandom = new Random();
						
	@Override
	public String getFortune() {
		
		System.out.println("Hello - getFortune()");
		
		// get array
		String[] data = setUpMyData();
		
		// Pick a random String from the array
		int index = myRandom.nextInt(data.length);
			
		String theFortune = data[index];
			
		return theFortune;
	}

}
