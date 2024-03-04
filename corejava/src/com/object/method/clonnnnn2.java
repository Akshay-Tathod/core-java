package com.object.method;

public class clonnnnn2  implements Cloneable{  
	int rollno;  
	String name;  
	  
	clonnnnn2(int rollno,String name){  
	this.rollno=rollno;  
	this.name=name;  
	}  
	  
	public Object clone()throws CloneNotSupportedException{  
	return super.clone();  
	}  
	  
	public static void main(String args[]){  
	try{  
	clonnnnn2 s1=new clonnnnn2(101,"amit");  
	  
	clonnnnn2 s2=(clonnnnn2)s1.clone();  
	  
	System.out.println(s1.rollno+" "+s1.name);  
	System.out.println(s2.rollno+" "+s2.name);  
	  
	}catch(CloneNotSupportedException c){}  
	  
	}  
	}  
