package com.mesa.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {

	private FortuneService fortuneService;
	
	// define a default constructor
	public SoccerCoach() {
		System.out.println(">> SoccerCoach: Inside the default constructor");
	}
	
	/*
	// define a setter method
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> SoccerCoach: Inside setFortuneService() method");
		this.fortuneService = theFortuneService;
	}
	*/
	
	/*
	// define any method
		@Autowired
		public void doSomeCrazy(FortuneService theFortuneService) {
			System.out.println(">> SoccerCoach: Inside doSomeCrazyStuff() method");
			this.fortuneService = theFortuneService;
		}
	*/	
	

	// Constructor Injection
	@Autowired
	public SoccerCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Practice corner kicks";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
