package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PaymentAspect {
	
//	@Before("execution( public void mypaymen())")
//	
//	public void before() {
//		System.out.println("Check the balance is sufficient oe not");
//	}
//	
//	
//	@After("execution (* com.aop.*(..))")
//	public void after() {
//		System.out.println("payment is successfull");
//	}
	
//	
//	@Before("execution( public void mypayment())")
//	public void beforeMsg() {
//		System.err.println("UR pack is Expiring Soon . Plz Recharge ... ! ");
//	}
//
//	@After("execution (* com.aop.Payment.*(..))")
//	public void afterMsg() {
//		System.err.println("Congratulation Enjoy ur Data Pack ... ! ");
//	}
//	
	
	@Around("execution (* com.aop.Payment.*(..))")
	public void aroundMsg(ProceedingJoinPoint p) {
		System.err.println("Check balance is sufficient or not ... ! ");

		try {
			p.proceed();
		} catch (Throwable e) {

			e.printStackTrace();

		}
		System.err.println("your money is credited successfully ... ! ");
	}
	

}
