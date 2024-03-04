package test;

public class AAA {

	public static void main(String[] args) {

		int arr[] = { 5, 4, 9, 8 };
		for (int i = 0; i < 4; i++) {

			if (arr[i] % 2 == 0) {
				for (int j = i + 1; j < 4; j++) {

					System.out.println(arr[j-1]);
				}
			}
		}

	}
}
