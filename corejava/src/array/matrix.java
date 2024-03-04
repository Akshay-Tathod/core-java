package array;
import java.util.Scanner;
public class matrix 
{ void max() {
	int a[][][]=new int[2][2][2];
	Scanner r=new Scanner(System.in);
System.out.println("enter number");
	
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++) {
			for(int k=0;k<2;k++)
		{
			a[i][j][k]=r.nextInt();
		}
	}
	}
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			for(int k=0;k<2;k++)
			System.out.print(a[i][j][k]+" ");
		}System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		matrix s=new matrix();
		s.max();
	
		}

}


