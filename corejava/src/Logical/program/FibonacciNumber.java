package Logical.program;

public class FibonacciNumber {

	public static void main(String[] args) {
		int a = 0, b = 1, c;
		System.out.println(a + "\n" + b);
		for (int i = 1; i <= 10; i++) {
			c = a + b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
	}

}
