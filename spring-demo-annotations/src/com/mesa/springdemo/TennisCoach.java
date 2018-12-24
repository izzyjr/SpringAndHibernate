package com.mesa.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: Inside the default constructor");
	}
	
	/*
	// define a setter method
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: Inside setFortuneService() method");
		this.fortuneService = theFortuneService;
	}
	*/
	
	// define any method
		@Autowired
		public void doSomeCrazy(FortuneService theFortuneService) {
			System.out.println(">> TennisCoach: Inside doSomeCrazyStuff() method");
			this.fortuneService = theFortuneService;
		}
	
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
