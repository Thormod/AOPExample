package org.thormod.aop;

public class AOPdemo {
	
	public static void main (String[] args) {
		AOPdemo aop = new AOPdemo();
		aop.someMethod(4);
		aop.someMethod(4, "cuatro");
		aop.anotherMethod(4);
	}
	
	public void someMethod(int var) {
		System.out.println("someMethod with integer");
	}
	
	public void someMethod(int var, String str) {
		System.out.println("someMethod with integer and String");
	}
	
	public void anotherMethod(int var) {
		System.out.println("anotherMethod with integer");
	}
}
