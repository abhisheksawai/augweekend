package staticDemo;

public class staticblock3 {
	
	{
		System.out.println(" block3");
	}
	{
		System.out.println(" block1");
	}
	
	
	static	{ System.out.println("static "); 	}
	
	
	{
		System.out.println(" block2");
	}
	
	public staticblock3()
	{
		System.out.println("con");
	}

	public static void main(String[] args) {
		
		staticblock3 sb = new staticblock3();
		

	}

}
