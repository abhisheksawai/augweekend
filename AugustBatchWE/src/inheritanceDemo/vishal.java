package inheritanceDemo;
               //CHILD CLASS      PARENT CLASS
public class vishal extends sharad {
	
	public void v1()
	{
		System.out.println("v one");
	}
	public void v2()
	{
		System.out.println("v2");
	}

	public static void main(String[] args) {
		
		vishal v = new vishal();
		v.s1();
		v.s2();
		
	}
}
