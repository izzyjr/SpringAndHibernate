package com.mesa.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// Load the configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// Retrieve Singleton bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		// Check to see if these are the same bean
		boolean result = (theCoach == alphaCoach);
		
		// Print out the results
		System.out.println("\n pointing to the same object: " +  result);
		
		System.out.println("\n memory location for theCoach: " + theCoach);
		
		System.out.println("\n memory location for alphaCoach: " + alphaCoach + "\n");
		
		// close container
		context.close();
		
	}

}
