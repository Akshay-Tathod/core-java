package Logical.program;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Akshay";
		String m = "yahskA";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (m.equals(rev)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
