package com.mesa.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BasketBallJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from the spring container
		Coach theCoach = context.getBean("basketBallCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
		
	}

}
