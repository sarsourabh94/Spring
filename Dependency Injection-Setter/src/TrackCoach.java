package com.example.springdemo;

public class TrackCoach implements Coach {

	// Define private field for dependency
	private FortuneService fortuneService;

	// Define a constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	public TrackCoach() {}
	@Override
	public String getDailyWorkout() {
		return "Run daily for 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
