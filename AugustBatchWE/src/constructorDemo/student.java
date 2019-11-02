package constructorDemo;

public class student extends teacher {	
	int roll;
	String name;	
	public void s1()
	{
		super.t1();
		System.out.println("s1");
		super.t1();
	}
	public void t1()
	{
		//super.t1();
		System.out.println("s-t1");
		//super.t1();
	}
	
	public static void main(String[] args) {
		
		student s = new student();
		teacher t = new teacher();
		s.t1();
		s.t2();
		s.s1();
		//super.t1();
	}
}
