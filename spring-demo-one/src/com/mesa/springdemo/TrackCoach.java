package com.mesa.springdemo;

public class TrackCoach implements Coach {
	
	// define a private field for the dependency
	private FortuneService fortuneService;
		
	public TrackCoach() {
		super();
	}

	// define a constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {

		// use my FortuneService to get a fortune
		return "Just do it: " + fortuneService.getFortune();
	}

}
