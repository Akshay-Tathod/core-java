package Logical.program;

public class MaxNumberSecond {

	public static void main(String[] args) {
		int a[] = { 85, 45, 25, 12, 98, 16, 35, 15, 52 };
		int res = a[0];
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		for (int r : a) {
			res = a[a.length - 2];
		}
		System.out.println(res);

	}
	private MaxNumberSecond(){
		System.out.println("Akhsay");
	}
	MaxNumberSecond s=new MaxNumberSecond();
	
	
}
