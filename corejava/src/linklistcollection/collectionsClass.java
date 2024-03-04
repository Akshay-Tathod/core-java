package linklistcollection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class collectionsClass {

	public static void main(String[] args) {
 
		List value=new LinkedList<>();
		value.add(60);
		value.add(20);
		value.add(30);
		value.add(40);
		value.add(50);
		System.out.println(value.iterator());

		/*System.out.println("by usesing get method output ---->"+ value.get(2));
		System.out.println("by usesing method output ---->"+ value);
		System.out.println("by usesing max method output ---->"+ Collections.max(value));
		System.out.println("by usesing min method output ---->"+ Collections.min(value));
        Collections.sort(value);
        System.out.println("by usesing sort mothod "+value);
        Collections.reverse(value);
        System.out.println("by usesing revers mothod "+ value);
        Collections.reverse(value);
        Collections.replaceAll(value,60,10);
        System.out.println(value);
        Collections.indexOfSubList(value,value);*/
        
	}
}
