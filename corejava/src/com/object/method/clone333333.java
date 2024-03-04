package com.object.method;

public class clone333333 implements Cloneable {
	String name;
	int rollno;
	

	@Override
	public String toString() {
		return "[name=" + name + ", rollno=" + rollno + "]";
	}


	public clone333333(String name, int rollno) {

		this.name = name;
		this.rollno = rollno;
	}


	public static void main(String[] args) throws CloneNotSupportedException {
		
		clone333333 s1=new clone333333("Akshay",464);
		clone333333 s2=(clone333333)s1.clone();
		System.out.println(s1);
		System.out.println(s2);
	
	}
		

}
