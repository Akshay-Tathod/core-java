package method;

public class returnpassingparameter
{

	int sub(int a,int b)
	{
		a=20;
		b=10;
		int c=a-b;
		System.out.println("substraction of this two number is " + c);
		return c;
	
	}
	int add(int a,int b)
	{
		a=20;
		b=10;
		int c=a+b;
		System.out.println("addition of this two number is " + c);
		return c;
	
	}
	int prod(int a,int b)
	{
		a=20;
		b=10;
		int c=a*b;
		System.out.println("product of this two number is " + c);
		return c;
	
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		returnpassingparameter a=new returnpassingparameter();
		a.sub(20,10);
		a.add(10,20);
		a.prod(20,10);

	}

}
