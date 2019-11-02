package exceptionDemo;

import java.io.FileInputStream;

public class exception5throw {
	
	public void check()
	{ 
		int age=20;
	
		if (age<25)
			throw new ArithmeticException("not valid for voting");  
	}

	public static void main(String[] args) {
		
	
			exception5throw e = new exception5throw();
			e.check();
	}

}
