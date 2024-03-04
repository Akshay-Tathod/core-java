package Logical.program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueNumber {

	public static void main(String[] args) {
		Integer[] s = { 1, 22, 1, 45, 8, 4, 1, 6, 45 };
		Set<Integer> g = new HashSet<>(Arrays.asList(s));
		System.out.println("Unique value set:" + g);
	}

}
