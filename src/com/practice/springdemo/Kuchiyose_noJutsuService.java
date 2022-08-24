package com.practice.springdemo;

import org.springframework.stereotype.Component;

@Component
public class Kuchiyose_noJutsuService implements JutsuService{

	@Override
	public String doJutsu() {
		return "Kuchiyose no Jutsu completed. Ero-sannin is proud of you.";
	}

}
