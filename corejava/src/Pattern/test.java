package Pattern;

import java.util.Scanner;

public class test {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter a how many row are u required......");

		int r =sc.nextInt();

		for (int i = 1; i <= r; i++) {

			for (int k = 1; k <= r - i; k++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= 2 * i - 1; j++)

			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		for (int i = r-1; i >= 1; i--) {

			for (int k = 1; k <= r - i; k++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= 2 * i - 1; j++)

			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}
}
