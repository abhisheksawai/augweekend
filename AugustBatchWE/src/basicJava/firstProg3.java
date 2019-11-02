package basicJava;

public class firstProg3 {		
	int a=10; // instance varibale
	public void m1()
	{
		int b=20; //local variable for this m1 method
		System.out.println("m1 method");
		System.out.println(b);
	}
	private void m2()
	{
		int b=20; //local variable for this m1 method
		System.out.println("m2 method");
		System.out.println(b);
		firstProg3 ob = new firstProg3();
		ob.m1();
	}
	public static void main(String[] args) {
			firstProg3 obj = new firstProg3();
	    	//obj.m1();
	    	//System.out.println(obj.a);
	    	//System.out.println(obj.b);
	    	obj.m2();
		
	}
	
}


