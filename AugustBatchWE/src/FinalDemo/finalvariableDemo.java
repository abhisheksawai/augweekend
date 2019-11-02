package FinalDemo;

public class finalvariableDemo {
	
	final int i =10;
	
	public void m1()
	{
		//i=20;
		System.out.println(i);
	}

	public static void main(String[] args) {
		
		finalvariableDemo f = new finalvariableDemo();
		f.m1();
	}

}
