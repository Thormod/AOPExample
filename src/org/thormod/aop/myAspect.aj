package org.thormod.aop;

import org.aspectj.lang.annotation.Pointcut;

public aspect myAspect {
	pointcut function():
		call(void org.thormod.aop.AOPdemo.*(*));
	
	after(): function() {
		System.out.println("Aspect after...");
	}
	
	before(): function() {
		System.out.println("Aspect before...");
	}
}
