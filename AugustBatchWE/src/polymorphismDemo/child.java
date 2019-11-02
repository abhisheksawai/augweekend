package polymorphismDemo;

import basicJava.student;

public class child extends parent {
	
	public void shadi() 
	{
		System.out.println("to GF");
		super.shadi();
	}
	
//	public void callparent()
//	{
//		super.shadi();
//	}

	public static void main(String[] args) {
		child c = new child();
		c.property();
		student s = new student();
		s.xyz(10, "acess");
		c.shadi(); // gf
		//c.shadi();  // arrange
	//	c.callparent();
		super.shadi();
		
	}

}
