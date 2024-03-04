package collection;

public class Linkdemo {
	String name;
	float sallary;
	int id;
	
	public Linkdemo(String name, float sallary, int id) {
		super();
		this.name = name;
		this.sallary = sallary;
		this.id = id;
	}
	
	public static Linkdemo detail(String name, float sallary, int id) {
		return new Linkdemo(name,sallary,id);
	}
	

}
