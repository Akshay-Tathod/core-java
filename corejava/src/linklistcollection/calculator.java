package linklistcollection;

import java.util.LinkedList; 
import java.util.List;
import java.util.Scanner;

import java.util.Scanner;
import java.util.Set;
public class calculator {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("for use a calculator then enter a valid password this 143");
		int k=sc.nextInt();
		
		while(k==143) {
		System.out.println("if do yo want a addition else enter a one ");
		System.out.println("if do yo want a substraction else enter a two ");
		int i=sc.nextInt();
		switch(i) {
		case 1 :
	List<Integer> student=new LinkedList<>();
	System.out.println("enter a two number for addition");
	student.add(sc.nextInt()+sc.nextInt());
	System.out.println(".................");
	System.out.println(student);
	student.removeAll(student);
	student.removeAll(student);
	System.out.println("thank u for using this aplication......");
	System.out.println("if u need again calculator then follow a below instruction ");
	System.out.println("| | | | | |");
	System.out.println("v v v v v v");

		break;
	case 2 :
		//int y=sc.nextInt();
		//while(y==2) {
	List<Integer> student2=new LinkedList<>();
	System.out.println("enter a two number for substraction");
	student2.add(sc.nextInt()-sc.nextInt());
	System.out.println(".................");
	System.out.println(student2);
	student2.removeAll(student2);
	System.out.println("thank u for using this aplication......");
	System.out.println("if u need again calculator then follow a below instruction ");
	System.out.println("| | | | | |");
	System.out.println("v v v v v v");
		}
		}
		System.out.println("sorry please enter valide password........");

	//	}
}}