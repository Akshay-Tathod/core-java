package com.Interface;

public class MainDemo implements Demo {
	public void m2() {
		System.out.println("Abstract method........done with interface");
	}

	public static void main(String[] args) {
		MainDemo sc = new MainDemo();
		sc.m2();
	}

}
