package inheretunce;

public class student extends teacher {

  String studentname = "akshay";
  int studentrollno=202;
  String studentstandered= "second year";
  float collegetime= 8.30f;
  
  void std() {
	  System.out.println("student name--->  "+ studentname);
	  System.out.println("student roll no---> "+ studentrollno);
	  System.out.println("student standered--->"+ studentstandered);
	  System.out.println("collegetime in horse ---> 11 to 5.30"+ collegetime);
  }
	
}
