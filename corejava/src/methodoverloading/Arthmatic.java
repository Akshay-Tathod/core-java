package methodoverloading;
import java.util.Scanner;
public class Arthmatic {

	static Scanner sc =new Scanner(System.in);
	
	
    void m1(){
    	System.out.println("enter a two number for addition ");
      int x=sc.nextInt();
      int y=sc.nextInt();

    	int c=x+y;
    	System.out.println("without arg ==>"+c);
    }
    
    void m1(int x,int y){
    	
    	int c=x-y;
    	System.out.println("without arg ==>"+c);
    }
    
	public static void main(String[] args) {
		Arthmatic s=new Arthmatic();
		s.m1();
		System.out.println("enter two number for substraction");
		s.m1(sc.nextInt(),sc.nextInt());
	}
}


