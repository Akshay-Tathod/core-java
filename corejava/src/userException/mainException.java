package userException;
import userException.emp;
import userException.student;

import java.util.Scanner;
public class mainException {

	public static void main(String[] args) throws student {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter u r age for play a game");
	int age=sc.nextInt();
	if (age>=50) {
		throw new student("sry ur age not valid runtime");
	}
	
	else if  (age<=18) { 
		throw new emp("sry ur age not valid compile");
	}
	else {
		System.out.println("please wait game is loading........");

	}
	
	}
}
