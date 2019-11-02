package exceptionDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class exception5throws2 {
	
	public void check()throws IOException
	{ 
		int age=20;
	
		if (age>25)
		{
			System.out.println("kuch tp");
		}
			throw new IOException("not valid for voting IOException");  
	}

	public static void main(String[] args) throws IOException,FileAlreadyExistsException {
		
	
			exception5throws2 e = new exception5throws2();
			e.check();
	}

}
