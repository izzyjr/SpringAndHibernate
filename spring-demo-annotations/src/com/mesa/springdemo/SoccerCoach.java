package com.mesa.springdemo;

import org.springframework.stereotype.Component;

@Component("CholoSimeone")
public class SoccerCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice corner kicks for 30 minutes";
	}

}
