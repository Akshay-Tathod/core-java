package array;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("enter a which number are required a table");
		int r = sc.nextInt();
		for (int i = 1; i < arr.length+1; i++) {
			System.out.println( i +"*"+ r+ " = "+ (i * r));
		
	}

}
}