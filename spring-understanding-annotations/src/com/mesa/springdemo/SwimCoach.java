package com.mesa.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// Constructor Injection
	@Autowired
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public SwimCoach() {
		System.out.println(">> SwimCoach: Inside the default constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 100 laps of Freestyle";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
