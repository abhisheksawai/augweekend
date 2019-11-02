package testNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTC3Annotation3 {	

	
	@BeforeClass
	public void beforeclassMethod()
	{
		System.out.println("before-class-Method");
	}
	
	@BeforeTest
	public void beforetestmethod()
	{
		System.out.println("before-test-Annotation");
	}

	
	@Test
	public void d() throws Exception
	{
		System.out.println("d");
	}
	@Test
	public void e() throws Exception
	{
		System.out.println("e");
	}
	

}
