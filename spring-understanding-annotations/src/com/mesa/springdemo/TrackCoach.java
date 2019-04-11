package com.mesa.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	@Autowired
	public TrackCoach(@Qualifier("happyFortuneService")FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 5 Miles";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
