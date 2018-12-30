package com.mesa.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BasketBallJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from the spring container
		BasketBallCoach theCoach = context.getBean("basketBallCoach", BasketBallCoach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// call new methods
		System.out.println("Email: " + theCoach.getEmail());
		
		System.out.println("Team: " + theCoach.getTeam());
		
		//close the context
		context.close();
		
	}

}
