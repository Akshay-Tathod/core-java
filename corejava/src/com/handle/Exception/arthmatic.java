package com.handle.Exception;
import java.util.Scanner;
public class arthmatic
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args)
	{
		try 
		{ 
			System.out.println("enter a two number ");
		int c=sc.nextInt()+sc.nextInt();
		System.out.println("addition "+c);
		}
		catch (Exception e)
		   {
			System.out.println(e);
		   }
	}
}
