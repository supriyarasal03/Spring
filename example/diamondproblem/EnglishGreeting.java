package com.example.diamondproblem;

import org.springframework.stereotype.Component;

@Component("eng")
public class EnglishGreeting   implements GreetingService {

	@Override
	public String greeting() {
		
		return "english greeting" + " good morning";
		
	}

}
