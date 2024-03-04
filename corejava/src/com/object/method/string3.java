package com.object.method;

public class string3 {

	int no1;
	int no2;
	int res;
	string3(int no1, int no2, int res) {
		this.no1 = no1;
		this.no2 = no2;
		this.res = res;
	}
	
	
	public String toString() {
		return no1+"  "+"  "   +no2+"  "+res+"  " ;
	}

	public static void main(String[] args) {
		
		string3 s=new string3(5,8,10);
		System.out.print(s);
	}

}
