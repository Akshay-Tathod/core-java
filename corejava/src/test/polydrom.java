package test;

import java.util.Scanner;

public class polydrom {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int r, sum = 0, temp;
		System.out.println("please enter a number for checking polydrom");
		int n = sc.nextInt();
		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (sum == temp) {
			System.out.println("polydrom");
		} else {
			System.out.println("not polydrom");
		}
	}

}
