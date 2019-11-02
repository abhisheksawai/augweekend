package constructorDemo;
public class newstudent {		
	int roll;
	String name;	
	
public newstudent(int i, String string) {
		roll=i;
		name=string;
	}

	public static void main(String[] args) {		
	
		newstudent s1 = new newstudent();
		newstudent s = new newstudent(101,"abhishek");
	

	System.out.println(s.roll);
	System.out.println(s.roll);
	System.out.println(s1.roll);
	System.out.println(s1.roll);
	}
}