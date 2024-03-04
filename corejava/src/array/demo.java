package array;

import java.util.Scanner;

public class demo {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int arr[][] = new int[4][4];
		System.out.println("enter a 4 number");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}

		}
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	
	}
}
