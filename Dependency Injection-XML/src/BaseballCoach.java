package com.example.springdemo;

public class BaseballCoach implements Coach {

	// Define private field for dependency
	private FortuneService fortuneService;

	// Define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 min on batting";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
