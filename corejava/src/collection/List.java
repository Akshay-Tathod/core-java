package collection;
import java.util.Vector;

public class List<E>
{

	public static void main(String[] args) 
	{
	Vector a=new Vector<>();
	a.add(4);
	a.add(6);
	a.add(8);
	a.add(10);
	System.out.println(a);
	System.out.println(	a.size());
	System.out.println(a.isEmpty());
	a.clear();	
	System.out.println(a.isEmpty());
	System.out.println(	a.size());
	}

}
