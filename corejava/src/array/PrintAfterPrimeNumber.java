package array;

import java.util.Scanner;
public class PrintAfterPrimeNumber {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter a six number array :");
		int a[] = new int[5];
		int i;
		for (i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}


		for (i = 0; i < a.length; i++) {
			System.out.println("you enter this number is : " + a[i]);
		}
		for (i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				for (i = i; i < a.length; i++)
					System.out.println("this is geting after prime number --> "+a[i]);
			}
		}

	}

}
