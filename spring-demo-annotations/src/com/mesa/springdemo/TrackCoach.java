package com.mesa.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

	public TrackCoach() {
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
