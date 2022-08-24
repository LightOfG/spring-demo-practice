package com.practice.springdemo;

import org.springframework.stereotype.Component;

@Component
public class EdoTensei_noJutsuService implements JutsuService {

	@Override
	public String doJutsu() {
		return "Edo Tensei no Jutsu completed. Hokages are here.";
		
	}

}
