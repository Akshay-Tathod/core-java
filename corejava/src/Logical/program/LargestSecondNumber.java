package Logical.program;

public class LargestSecondNumber {

	public static void main(String[] args) {

		int a[] = { 2, 4, 8, 7, 5 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;

				}
			}
		}
		System.out.println(a[a.length-2]);

	}

}
