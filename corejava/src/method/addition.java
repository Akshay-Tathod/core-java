package method;

public class addition 
{
	void add()
	{
		int a=20;
		int b=10;
		int c=a+b;
		System.out.println("addition of this two number is " + c);
	}
	void sub()
	{
		int a=20;
		int b=10;
		int c=a-b;
		System.out.println("substraction of this two number is " + c);
	}
	void prod()
	{
		int a=20;
		int b=10;
		int c=a*b;
		System.out.println("product of this two number is " + c);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		addition a=new addition ();
		a.add();
		a.sub();
		a.prod();
		
	}

}
