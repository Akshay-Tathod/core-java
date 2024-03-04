package setdemo;

import java.util.HashSet;
import java.util.Set;

public class Student {

	public static void main(String[] args) {
       Set<Integer> student = new HashSet<>();
       student.add(250);
       student.add(12);
       student.add(20);
       for(int name:student) {
    	   System.out.println(student);
       }
}
	}
