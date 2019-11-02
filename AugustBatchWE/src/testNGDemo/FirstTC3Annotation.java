package testNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTC3Annotation {	
	@Test(priority = 1)
	public void b() throws Exception
	{
		System.out.println("b");
	}
	
	@Test(priority = 2)
	public void a() throws Exception
	{
		System.out.println("a");
	}
	
	@Test(priority = 0)
	public void e() throws Exception
	{
		System.out.println("e");
	}
	@Test
	public void d() throws Exception
	{
		System.out.println("d");
	}

}
