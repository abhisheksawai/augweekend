package exceptionDemo;

import java.io.FileInputStream;

public class exception4 {

	public static void main(String[] args) {
		
		//FileInputStream fis  = new FileInputStream("C:\\Users\\lenovo\\Desktop\\tikona.txt");
	 
		
		System.out.println("program start");
		int i =10;
		int div = 0;		
		try {
			div=i/0; // exception aa rha hai -
		}
		
		catch(ArithmeticException nae)
	{
		System.out.println("bhai 0 se div na kar");
	}
//		catch(ArithmeticException anae)
//		{
//			System.out.println(anae);
//		}
		
		
		finally{
			
			System.out.println("finally block is always executed");
			
		
		}  
		
		System.out.println(div);
		System.out.println("after div");
	}

}
