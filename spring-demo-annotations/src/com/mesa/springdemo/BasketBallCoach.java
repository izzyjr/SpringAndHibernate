package com.mesa.springdemo;

public class BasketBallCoach implements Coach {

	private FortuneService fortuneService;
	
	
	
	public BasketBallCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "100 lay ups";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
