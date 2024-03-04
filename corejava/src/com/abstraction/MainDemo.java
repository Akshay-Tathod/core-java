package com.abstraction;

public class MainDemo extends Demo {

	
	void m2() {
		System.out.println("Abstract method........done");
	}
	public static void main(String[] args) {
		Demo sc=new MainDemo();
		sc.m1();
		sc.m2();

	}

}
