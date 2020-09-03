package com.example.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//creating a new arg constructor
	public CricketCoach()
	{
		System.out.println("Inside default constructor");
	}
	
	//setter method for injection	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling 10 min daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
