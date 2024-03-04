package com.object.method;

public class tostringgggg {
	int id;
	String name;
	tostringgggg(	int id,	String name) {
		this.id=id;
		this.name=name;
	}
	public String toString() {
	return id +"  "+ name;
	}
	public static void main(String[] args) {
		tostringgggg s=new tostringgggg(101,"Akshay");
		System.out.println(s);
	}

}
