package encapsulation;

import java.util.Scanner;

public class manistudent {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student a=new student();
		System.out.println("enter student id");
		a.setId(sc.nextInt());
		System.out.println("enter student name");
		a.setNm(sc.next());
		
		System.out.println("id is -"+a.getId());
		System.out.println("name is -"+a.getNm());

		
	
}
}