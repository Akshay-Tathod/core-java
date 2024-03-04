package Logical.program;

public class EachWordFirstLetter {

	public static void main(String[] args) {
		String s = "The Kiran Academy Pune";
		System.out.println(s.charAt(0));
		for (int i = 0; i <= s.length() - 1; i++) {
			if (s.charAt(i) == ' ') {
				System.out.println(s.charAt(i + 1));
			}

		}

	}

}
