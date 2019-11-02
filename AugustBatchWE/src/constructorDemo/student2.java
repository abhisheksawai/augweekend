package constructorDemo;

public class student2 extends teacher {
	
	int roll;
	String name;
	
	public void s1()
	{
		System.out.println("s1");
	}

	public student2()
	{
		System.out.println("default con");
	}
	
	public static void main(String[] args) {
		
		student2 s = new student2();
		teacher t = new teacher();
		teacher t1 = new student2();
		//student2 s2 = new teacher();
	}
}
