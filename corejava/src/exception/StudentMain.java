package exception;
import exception.Student;
import java.util.Scanner;
public class StudentMain {

void add() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a age ");
	int a=sc.nextInt();
	if (a<=10) { 
		throw new Student("u not valid");
	}else
	{
		System.out.println("play a game");
	}
}
public static void main(String[] args) {
	StudentMain a=new StudentMain();
	a.add();
}
}
