package com.mesa.springdemo;

public class SoccerCoach implements Coach{
	
	// define a private field for the dependency
	private FortuneService fortuneService;
			
	// define a constructor for dependency injection
	public SoccerCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice penalty shooting for 30 minutes";
	}

	@Override
	public String getDailyFortune() {

		// use my FortuneService to get a fortune
		return "Get it: " + fortuneService.getFortune();
	}
	
}
