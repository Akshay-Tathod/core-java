package map;
import java.util.Map;
import java.util.Collections;
import java.util.LinkedHashMap;


public class treemap {

	public static void main(String[] args) {
		Map<Integer,String> ht=new LinkedHashMap<>();
		ht.put(101,"Akshay");
		ht.put(103,"Nitesh");
		ht.put(102,"Priti");
		ht.put(105,"Sakshi");
		ht.put(104,"Akshay");
		System.out.println(ht);
		System.out.println(	ht.containsKey(102));
		System.out.println(	ht.containsValue("Gopal"));
		System.out.println(	ht.equals(ht));
		
	}

}
