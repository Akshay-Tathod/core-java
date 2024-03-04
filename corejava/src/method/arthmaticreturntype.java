package method;

public class arthmaticreturntype 
{

	int add()
	{
		int a=20;
		int b=10;
		int c=a+b;
		System.out.println("addition of this two number is " + c);
		return c ;
	}
	int sub()
	{
		int a=20;
		int b=10;
		int c=a-b;
		System.out.println("substraction of this two number is " + c);
		return c ;
	}
	int prod()
	{
		int a=20;
		int b=10;
		int c=a*b;
		System.out.println("product of this two number is " + c);
		return c ;
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		arthmaticreturntype  a=new arthmaticreturntype ();
		a.add();
		a.sub();
		a.prod();
	}

}
