package Logical.program;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter number which u have required factorial");
		int n = sc.nextInt();
		int res = 1;
		for (int i = 1; i <= n; i++) {
			res = res * i;
		}
		System.out.println(res);
	}

}
