package method;
import java.util.Scanner;
public class valuefromuser {
	int sub(int a,int b)
	{
		int c=a-b;
		System.out.println("substraction of this two number is " + c);
		return c;
	
	}
	int add(int a,int b)
	{
		int c=a+b;
		System.out.println("addition of this two number is " + c);
		return c;
	
	}
	int prod(int a,int b)
	{
		int c=a*b;
		System.out.println("product of this two number is " + c);
		return c;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		valuefromuser s=new valuefromuser();
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter a two number");

		 int x=sc.nextInt();
		 int y=sc.nextInt();
		 
		 s.sub(x,y);
		 s.add(x,y);
		 s.prod(x,y);

	}

}
