package array;

public class EvenNumber {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 5, 8, 7, 5, 4, 5, 45, 46, 84, 55 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
