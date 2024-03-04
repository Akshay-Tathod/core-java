package Logical.program;

public class ArmStrongNumber {

	public static void main(String[] args) {

		int r, sum = 0, temp;
		int n = 8208;
		temp = n;
		while (n > 0) {
			r = n % 10;
			int a = r * r * r * r;
			sum = sum + a;
			n = n / 10;

		}
		if (temp == sum) {
			System.out.println(temp + "   armstrong Number");
		} else {
			System.out.println(temp + "   not armstrong Number ");
		}
	}

}
