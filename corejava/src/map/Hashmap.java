package map;
import java.util.Map;
import java.util.HashMap;

public class Hashmap<k,v> {

	public static void main(String[] args) {
		
		Map<Integer,String> ht=new HashMap<>();
		ht.put(101,"Akshay");
		ht.put(102,"Nitesh");
		ht.put(103,"Priti");
		ht.put(104,"Sakshi");
		ht.put(105,"Akshay");
		System.out.println(ht);
	System.out.println(	ht.containsKey(102));
	System.out.println(	ht.containsValue("Gopal"));
	ht.remove(105);
	System.out.println(ht);
	System.out.println(	ht.equals(ht));
	

	}

}
