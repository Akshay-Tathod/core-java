package Logical.program;

public class PrintVowelInGienString {

	public static void main(String[] args) {
		String s = "The Kiran Java";
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A'
					|| ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
				System.out.println(ch[i]);
			}
		}
	}

}
