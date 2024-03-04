package array;

import java.util.Scanner;

public class Practice {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a[] = new int[10];
		int sum = 0;
		System.out.println("enter a ten number for addition ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(i+" you have enter a two number is : "+ a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
	}
}
