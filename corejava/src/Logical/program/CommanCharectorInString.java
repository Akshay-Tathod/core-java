package Logical.program;

public class CommanCharectorInString {

	public static void main(String[] args) {
		String s = "akshayk";
		for (int i = 0; i <= s.length()-1; i++) {
			for (int j = i + 1; j <= s.length()-1; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					System.out.println(s.charAt(i));
				}

			}

		}
	}

}
