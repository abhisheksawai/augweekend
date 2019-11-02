package staticDemo;

public class staticblock {
	
	static
	{
		System.out.println("static block");
	}
	
	
	public staticblock()
	{
		System.out.println("staticblock constructor");
	}

	public static void main(String[] args) {
		
		staticblock sb = new staticblock();
		

	}

}
