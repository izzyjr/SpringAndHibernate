package com.mesa.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("CholoSimeone")
public class SoccerCoach implements Coach {

	private FortuneService fortuneService;
	
	
	@Autowired
	public SoccerCoach(FortuneService fortuneService) {
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
