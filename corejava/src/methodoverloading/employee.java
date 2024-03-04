package methodoverloading;
import java.util.Scanner;
public class employee {
	static Scanner sc=new Scanner(System.in);
	void Emp(){
		System.out.println("without passing parametre");
	}
	void Emp(String s){
		System.out.println("enter a two number ");
		System.out.println(sc.nextInt()+sc.nextInt());
	}
	
	public static void main(String[] args) {
		employee tt=new employee();
		tt.Emp("sssds");
		tt.Emp();
		
	}

}
