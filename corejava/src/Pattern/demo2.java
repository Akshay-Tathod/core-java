package Pattern;

import java.util.Scanner;

public class demo2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter a number of row ");
		int r=sc.nextInt();
		for(int i=1;i<=r;i++) {
			for(int k=1;k<=r-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	
	for(int i=5;i>=r;i--) {
		for(int k=1;k<=5-i;k++) {
			System.out.print(" ");
		}
		for(int j=1;j<=2*i-1;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
