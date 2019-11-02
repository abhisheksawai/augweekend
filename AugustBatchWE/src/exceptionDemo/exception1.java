package exceptionDemo;

import java.io.FileInputStream;

public class exception1 {

	public static void main(String[] args) {
		
		//FileInputStream fis  = new FileInputStream("C:\\Users\\lenovo\\Desktop\\tikona.txt");
	 
		
		System.out.println("program start");
		int i =10;
		int div = 0;		
		try {
			div=i/0; // exception aa rha hai -
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		
		System.out.println(div);
		System.out.println("after div");
	}

}
