package com.mesa.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:fortunes.properties")
public class SportConfig {

	// define bean for our fortune service
	@Bean
	public FortuneService propertiesFileFortunesTwo() {
		return new PropertiesFileFortunesTwo();
	}
	
	// define bean for our TennisCoach and dependencies
	@Bean
	public Coach tennisCoach(FortuneService fortuneService) {
		return new TennisCoach(propertiesFileFortunesTwo());
	}
	
}
