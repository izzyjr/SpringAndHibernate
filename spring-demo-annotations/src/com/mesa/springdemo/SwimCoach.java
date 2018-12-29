package com.mesa.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	    
	@Value("${foo.team}")
	private String team;
	
	/*
	public SwimCoach() {
		System.out.println(">> SwimCoach: Inside the default constructor!");
	}
	*/
	
	/*
	// define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> SwimCoach: Inside my doMyStartupStuff");
	}
		
	// define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> SwimCoach: Inside my doMyCleanupStuff");
	}
	*/

	@Override
	public String getDailyWorkout() {
		return "100 laps of Butterfly stroke";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

}
