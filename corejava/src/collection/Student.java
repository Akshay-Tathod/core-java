package collection;

public class Student {
	String stdname;
	int stdrollno;
	double stdmarks;
	
	public Student(String stdname, int stdrollno, double stdmarks) {
		super();
		this.stdname = stdname;
		this.stdrollno = stdrollno;
		this.stdmarks = stdmarks;
	}
	
public static Student creatstudent (String stdname, int stdrollno, double stdmarks)
{
	return new Student(stdname, stdrollno, stdmarks);
}
}
