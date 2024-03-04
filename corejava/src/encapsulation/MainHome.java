package encapsulation;
import java.util.Scanner;
public class MainHome {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Home a=new Home();
	System.out.println("enter name of candidate");
	a.setSurname(sc.next());
	System.out.println("enter income of candidate");		
	a.setIncome(sc.nextInt());
	System.out.println("surname "+a.getSurname());
	System.out.println("Income "+a.getIncome());

	
	}

}
