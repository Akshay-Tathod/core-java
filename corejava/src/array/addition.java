package array;
public class addition
{

	void add() 
	{
		
		 int []arr=new int[10];
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
			System.out.print("*");
			}
			System.out.println();
		}
	
	}
	void ad() 
	{
		
		 int []arr=new int[10];
		for(int i=5;i<=i;i--)
		{
			for(int j=5;j<=i;j--)
			{
				
			System.out.print("*");
			}
		}
		System.out.println();
	
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		addition a=new addition();
		a.add();
		a.ad();
		

	}
}