package polymorphismDemo;

public class addition {
	
	public void addition(int num3, double num2)
	{
		System.out.println("5");
	}

	public void addition(double num3, int num2)
	{
		System.out.println("7");
	}
	public static void main(String[] args) {
		
		addition a = new addition();
		a.addition(7, 77.7);
		a.addition(5.5, 55);

	}

}
