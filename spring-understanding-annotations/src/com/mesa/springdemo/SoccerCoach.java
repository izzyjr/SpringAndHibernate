package com.mesa.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {

	/*
	@Autowired
	@Qualifier("happyFortuneService")
	*/
	private FortuneService fortuneService;
	
	// Constructor Injection
	@Autowired
	public SoccerCoach(@Qualifier("propertiesFileFortunesTwo") FortuneService fortuneService) {
//		System.out.println(">> SoccerCoach: Inside the default constructor");
		this.fortuneService = fortuneService;
	}
	
	/*
	public SwimCoach() {
		System.out.println(">> SwimCoach: Inside the default constructor");
	}
	*/

	@Override
	public String getDailyWorkout() {
		return "Practice 100 penlalty kicks";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
