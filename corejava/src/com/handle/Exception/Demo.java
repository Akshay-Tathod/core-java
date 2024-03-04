package com.handle.Exception;

public class Demo {

	public static void main(String[] args) {
		System.out.println("akshay");
		System.out.println("sanjog");
		System.out.println("vivek");

try {
	System.out.println("try block");

	int a=10/0;
	}
catch (Exception e){
	System.out.println(e);
	}
finally{
	System.out.println("final bock ");
}
}

}
