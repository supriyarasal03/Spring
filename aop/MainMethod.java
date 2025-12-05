package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.diamondproblem.MyConfigClass;
import com.example.diamondproblem.Service;

public class MainMethod {
	
	public static void main(String[] args) {
		
ApplicationContext  context = new AnnotationConfigApplicationContext(MyConfing.class);
		
		Payment s= context.getBean(Payment.class);
		s.mypayment();
		
		
	}

}
