package staticDemo;

public class calculations {
	
	public void m1()
	{
		System.out.println("m1");
	}
	
	public static void m2()
	{
		System.out.println("calc-m2");
	}

	public static void main(String[] args) {
	
			calculations c = new calculations();
			c.m1();
			
			
			calculations e = new calculations();
			e.m2();
			//--------
			calculations.m2();
			//---------
			m2();
			
			
		
	}

}
