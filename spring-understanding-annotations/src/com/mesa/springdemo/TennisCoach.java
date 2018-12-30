package com.mesa.springdemo;

public class TennisCoach implements Coach {

	private FortuneService fortuneService;	
	
	public TennisCoach(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: Inside the constructor!");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice backhand 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
