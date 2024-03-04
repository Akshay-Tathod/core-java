package com.basic;

public class Factorial {

	public static void main(String[] args) {

		int res = 1;
		int n = 5;
		for (int i = 1; i <= n; i++) {
			res = res * i;

		}
		System.out.println(res);
	}

}
