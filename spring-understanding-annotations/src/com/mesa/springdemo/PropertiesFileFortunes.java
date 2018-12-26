package com.mesa.springdemo;

import org.springframework.stereotype.Component;

@Component
public class PropertiesFileFortunes implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
