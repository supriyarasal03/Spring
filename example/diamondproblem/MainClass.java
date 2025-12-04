package com.example.diamondproblem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext  context = new AnnotationConfigApplicationContext(MyConfigClass.class);
		
		Service s= context.getBean(Service.class);
		
		System.out.println(s.getG1().greeting());
		System.out.println(s.getG2().greeting());
		System.out.println(s.getG3().greeting());
	}

}
