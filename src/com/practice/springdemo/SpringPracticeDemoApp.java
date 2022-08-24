package com.practice.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringPracticeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Konoha theShinobi = context.getBean(Konoha.class);
		
		System.out.println(theShinobi.controlChakra());	
		
		System.out.println(theShinobi.doYourJutsu());
		
		context.close();
		
	}

}
