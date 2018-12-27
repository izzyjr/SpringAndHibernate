package com.mesa.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertiesFileFortunes implements FortuneService {
	
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
	
	public String getFortuneOne() {
		return fortuneOne;
	}

	public String getFortuneTwo() {
		return fortuneTwo;
	}

	public String getFortuneThree() {
		return fortuneThree;
	}

	public String getFortuneFour() {
		return fortuneFour;
	}

	public String getFortuneFive() {
		return fortuneFive;
	}

		// Create an array of Strings
		private String[] data = {getFortuneOne(), getFortuneTwo(), getFortuneThree(), getFortuneFour(), getFortuneFive()};
		
		// Create a random number generator
		private Random myRandom = new Random();
				
		@Override
		public String getFortune() {
			// Pick a random String from the array
			int index = myRandom.nextInt(data.length);
			
			String theFortune = data[index];
			
			return theFortune;
		}

}
