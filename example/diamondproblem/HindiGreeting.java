package com.example.diamondproblem;

import org.springframework.stereotype.Component;

@Component("hin")
public class HindiGreeting  implements  GreetingService{

	@Override
	public String greeting() {
		
		return "Hindi greeting " + " सुप्रभात";
		
	}

}
