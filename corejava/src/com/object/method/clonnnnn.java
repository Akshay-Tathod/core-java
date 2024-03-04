package com.object.method;

public class clonnnnn implements Cloneable {
	String name;
	int rollno;
	clonnnnn(String name,	int rollno){
		this.name=name;
		this.rollno=rollno;
	}
	public Object Clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public static void main(String[] args) {
	try {
		clonnnnn s1=new clonnnnn("Akshay",(101+205));
		clonnnnn s2=(clonnnnn)s1.clone();
		System.out.println(s1.name + "  "+ s1.rollno);
		System.out.println(s2.name + "  "+ s2.rollno);

	}
	catch (CloneNotSupportedException c) {
		System.out.println(c);
	}}
}