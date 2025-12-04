package com.example.diamondproblem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Service {
	
	@Autowired
	@Qualifier("eng")
	GreetingService g1;
	
	@Autowired
	@Qualifier("mar")
	GreetingService g2;
	
	@Autowired
	@Qualifier("hin")
	GreetingService g3;

	public GreetingService getG1() {
		return g1;
	}

	public void setG1(GreetingService g1) {
		this.g1 = g1;
	}

	public GreetingService getG2() {
		return g2;
	}

	public void setG2(GreetingService g2) {
		this.g2 = g2;
	}

	public GreetingService getG3() {
		return g3;
	}

	public void setG3(GreetingService g3) {
		this.g3 = g3;
	}

	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Service(GreetingService g1, GreetingService g2, GreetingService g3) {
		super();
		this.g1 = g1;
		this.g2 = g2;
		this.g3 = g3;
	}

	@Override
	public String toString() {
		return "Service [g1=" + g1 + ", g2=" + g2 + ", g3=" + g3 + "]";
	}
	
	

}
