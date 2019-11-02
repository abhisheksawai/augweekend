package basicJava;

public class TestStudent2 {

	public static void main(String[] args) {		
		student s3 = new student();		
		student s2 = new student();		
		//student s4 = new student(103,"vijay");		
		student s4 = new student();
		s4.xyz(103,"vijay");
		System.out.println(s4.name);
		System.out.println(s4.roll);		
		//s2.roll=100;
		//roll=100;
		
		s2.name="abhishek";
	
		s3.roll=101;
		s3.name="vishal";
	
		System.out.println(s2.roll);
		System.out.println(s2.name);		
		System.out.println(s3.roll);
		System.out.println(s3.name);
		
		
		student ab = new student();
		ab.checkstudent();

	}

}
