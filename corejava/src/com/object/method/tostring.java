package com.object.method;

public class tostring {
	String cllgname;
	int cllgfee;
	int cllgid;

	public tostring(String cllgname, int cllgfee, int cllgid) {
		super();
		this.cllgname = cllgname;
		this.cllgfee = cllgfee;
		this.cllgid = cllgid;
	}

	@Override
	public String toString() {
		return "tostring [cllgname=" + cllgname + ", cllgfee=" + cllgfee + ", cllgid=" + cllgid + "]";
	}

	public static void main(String[] args) {
		tostring s1=new tostring("poteclg",46000,102);
		System.out.println(s1);
		
	}

}
