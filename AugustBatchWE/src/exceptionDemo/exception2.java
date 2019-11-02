package exceptionDemo;

import java.io.FileInputStream;

public class exception2 {

	public static void main(String[] args) {
		
		//FileInputStream fis  = new FileInputStream("C:\\Users\\lenovo\\Desktop\\tikona.txt");
	 
		
		System.out.println("program start");
		int i =10;
		int div = 0;		
		try {
			div=i/0; // exception aa rha hai -
		}
		catch(NumberFormatException ae)
		{
			System.out.println(ae);
		}
		catch(NullPointerException nae)
		{
			System.out.println(nae);
		}
		catch(ArithmeticException anae)
		{
			System.out.println(anae);
		}
		
		
		System.out.println(div);
		System.out.println("after div");
	}

}
