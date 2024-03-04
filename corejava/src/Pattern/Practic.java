package Pattern;

import java.util.Scanner;

public class Practic {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int arr[]=new int[6];
		int r=5;
		for (int i = 1; i <= r; i++) {
			for (int k = 1; k <= r-i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(arr[i]);
			}
			System.out.println();
		}

		for (int i = 5; i >= 1; i--) {
			for (int k = 1; k <= r-i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(arr[3]);
			}
			System.out.println();
		}

	}

}
