package com.practice.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Konoha_noShinobi implements Konoha{

	@Autowired
	@Qualifier("kuchiyose_noJutsuService")
	private JutsuService uzumaki_naruto;
	
	@Autowired
	@Qualifier("edoTensei_noJutsuService")
	private JutsuService orochimaru;
	
	
	
	public Konoha_noShinobi() {
		System.out.println("You are a shinobi now.");
	}

	@Override
	public String controlChakra() {
		
		return "Chakra controlled succesfully! " + uzumaki_naruto.doJutsu() ;
	}

	@Override
	public String doYourJutsu() {
		
		return "Amazing Jutsu "+ orochimaru.doJutsu();
	}
	
	

}
