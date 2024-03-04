package array;

public class SortingAssendingNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 4, 5 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}

			}
		}
		for (int a : arr) {
			System.out.println(a);
		}
	}
}