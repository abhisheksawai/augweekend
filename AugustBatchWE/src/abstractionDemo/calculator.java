package abstractionDemo;

public abstract class calculator {
	
	public void add()
	{
		System.out.println("addition");
	}
	
	public void sub()
	{
		System.out.println("sub");
	}
	abstract void mul();
	abstract void div();	
}
