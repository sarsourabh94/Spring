package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");		
		
		//Retrieve bean
		Coach theCoach=context.getBean("myCoach",Coach.class);
		
		//call method on bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call the newly created method
		System.out.println(theCoach.getDailyFortune());
		
		//close context
		context.close();

	}

}
