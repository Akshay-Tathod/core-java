package Logical.program;

public class SwapingWithoutUsesingThirdVariable {

	public static void main(String[] args) {

		int a=5;
		int b=10;
		System.out.println("Befor Swapping...............");
		System.out.println(" a= "+a + " b= "+ b);
		
		a=a+b;
	    b=a-b;
	    a=a+b;
	    System.out.println("After Swapping...............");
	    System.out.println(" a= "+a + " b= "+ b);
	    
	}

}
