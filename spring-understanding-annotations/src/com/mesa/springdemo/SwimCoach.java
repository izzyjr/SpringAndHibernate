package com.mesa.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
	
	/*
	@Autowired
	@Qualifier("happyFortuneService")
	*/
	private FortuneService fortuneService;
	
	
	// Constructor Injection
	@Autowired
	public SwimCoach(@Qualifier("propertiesFileFortunes") FortuneService fortuneService) {
		System.out.println(">> SwimCoach: Inside the default constructor");
		this.fortuneService = fortuneService;
	}
	
	/*
	public SwimCoach() {
		System.out.println(">> SwimCoach: Inside the default constructor");
	}
	*/

	@Override
	public String getDailyWorkout() {
		return "Swim 100 laps of Freestyle";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
