package linklistcollection;
import java.util.LinkedList;
import java.util.Scanner;

public class college <E>{
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("if do yo want a substraction else enter a two ");
		System.out.println("if do yo want a addition else enter a one ");
	int k=sc.nextInt();
		if(k<=1) {
	LinkedList<Integer> student=new LinkedList<>();
	System.out.println("enter a two number for doing a addition");
	student.add(sc.nextInt()+sc.nextInt());
	System.out.println(".................");
	System.out.println(student);
	student.removeAll(student);
	
	

	}
	int y=sc.nextInt();
		while(k<=2) {
	LinkedList<Integer> student=new LinkedList<>();
	System.out.println("enter a two number for doing a substraction");
	student.add(sc.nextInt()-sc.nextInt());
	System.out.println(".................");
	System.out.println(student);
	student.removeAll(student);
	
		}
		
}
	}


