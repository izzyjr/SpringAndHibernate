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
				
		@Override
		public String getFortune() {
			
			// Create an array of Strings
			String[] data = {getFortuneOne(), getFortuneTwo(), getFortuneThree(), getFortuneFour(), getFortuneFive()};
			
			// Create a random number generator
			Random myRandom = new Random();
			
			// Pick a random String from the array
			int index = myRandom.nextInt(data.length);
			
			String theFortune = data[index];
			
			return theFortune;
		}

}
