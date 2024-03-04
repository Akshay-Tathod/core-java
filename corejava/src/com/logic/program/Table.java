package com.logic.program;
import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
System.out.println("enter a number which which u have table.....");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<11;i++) {
			int t=i*n;
			System.out.println(t);
		}
	}

}
