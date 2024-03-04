package method;

public class passingparameter
{

	void sub(int a,int b)
	{
		a=20;
		b=10;
		int c=a-b;
		System.out.println("substraction of this two number is " + c);
	
	}
	void add(int a,int b)
	{
		
		int c=a+b;
		System.out.println("addition of this two number is " + c);
	
	}
	void prod(int a,int b)
	{
		a=20;
		b=10;
		int c=a*b;
		System.out.println("product of this two number is " + c);
	
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		passingparameter a=new passingparameter();
		a.add(10, 20);
		a.sub(20,10);
		a.prod(10,20);
		
	}

}
