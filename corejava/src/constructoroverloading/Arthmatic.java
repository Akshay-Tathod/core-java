package constructoroverloading;

public class Arthmatic {
	Arthmatic(){
		System.out.println("without passing parameter");
	}
	Arthmatic(int x,int y){
		System.out.println("with passing parameter");

	}
	Arthmatic(int x){
		System.out.println("with single passing parameter");

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arthmatic s=new Arthmatic();
	}

}
