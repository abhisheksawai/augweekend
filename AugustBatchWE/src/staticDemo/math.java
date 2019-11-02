package staticDemo;

public class math extends calculations{
	
	public void chechsuper()
	{
		super.m2();
	}
	
	public static void m2()
	{
		System.out.println("math-m2");
	}

	public static void main(String[] args) {
		
		calculations d = new calculations();
		d.m1();
		//----
		calculations.m2();
		m2();
		math m = new math();
		m.chechsuper();

	}

}
