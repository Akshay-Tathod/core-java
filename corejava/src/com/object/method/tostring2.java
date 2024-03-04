package com.object.method;

public class tostring2 {
    int rollno;
    String name ;
	tostring2(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	public String toString(){
		return rollno +" "+name;
	}
	public static void main(String[] args) {
		
		tostring2 s=new tostring2(102,"Akshay");
		System.out.println(s);
	}

}
