package com.logic.program;

public class DessendingOrder {

	public static void main(String[] args) {
		int a[] = { 12, 63, 57, 64, 88, 46, 21, 89, 10, };
		int tem = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++)
				if (a[i] > a[j]) {
					tem = a[i];
					a[i] = a[j];
					a[j] = tem;
				}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
