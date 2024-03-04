package array;

public class INNN {

	public static void main(String[] args) {

		int a[] = { 5, 4, 5, 6, 4, 3, 2, 1, 5, 8, 7, 6 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[j]);
				}
			}
		}
	}

}
