package com.example.diamondproblem;

import org.springframework.stereotype.Component;

@Component("mar")
public class MarathiGreeting  implements  GreetingService{

	@Override
	public String greeting() {
	return "Marathi Greeting "+  "शुभ सकाळ";
	}

}
