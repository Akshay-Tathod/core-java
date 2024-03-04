package linklistcollection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Student <E>{

	public static void main(String[] args) {	
		List<Integer> aa=new LinkedList<>();
		aa.add(77);
		aa.add(21);
		aa.add(03);
		aa.add(60);
		aa.add(40);
		System.out.println(Collections.min(aa));
		System.out.println(Collections.max(aa));
		Collections.reverse(aa);
		System.out.println(aa);
		Collections.sort(aa);
		System.out.println(aa);
	} 

}
