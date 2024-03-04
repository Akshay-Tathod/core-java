package Logical.program;

import java.util.Scanner;

public class PallidromNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r, sum = 0, temp;
		System.out.println("please enter a number for checking pallidram number");
		int n = sc.nextInt();
		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;

		}
		if (temp == sum) {
			System.out.println(temp + "   Pallidrom Number");
		} else {
			System.out.println(temp + "   not Pallidrom Number ");
		}
	}

}
