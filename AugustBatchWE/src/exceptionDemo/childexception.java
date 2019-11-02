package exceptionDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileLockInterruptionException;
import java.nio.file.FileAlreadyExistsException;

public class childexception {
	
	public void check() throws IOException
	{
		System.out.println("c - c");
	}
	

	public static void main(String[] args)throws IOException {		
	
			childexception e = new childexception();
			
				e.check();
				
			
	}

}
