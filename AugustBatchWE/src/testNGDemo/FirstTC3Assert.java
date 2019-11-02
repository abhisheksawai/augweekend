package testNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTC3Assert {	

	
	@Test
	public void d() throws Exception
	{
		String actual ="20";
		String expected ="20";
		System.out.println("d");
		Assert.assertEquals(actual, expected);
	}
	
	

}
