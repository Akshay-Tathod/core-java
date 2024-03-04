package collection;

public class Student1 {
	String stdname;
	int stdrollno;
	double stdmarks;
	
	public Student1(String stdname, int stdrollno, double stdmarks) {
		super();
		this.stdname = stdname;
		this.stdrollno = stdrollno;
		this.stdmarks = stdmarks;
	}
	public static Student1 creatstudent(String stdname, int stdrollno, double stdmarks) {
		return new Student1(stdname,  stdrollno,  stdmarks);
	}
	
}
