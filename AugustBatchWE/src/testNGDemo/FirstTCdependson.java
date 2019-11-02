package testNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTCdependson {
	
	@Test
	public void TC01() throws Exception
	{
		System.out.println("tc01");
		String actual ="20";
		String expected ="230";
		System.out.println("d");
		Assert.assertEquals(actual, expected);
	}
	
	@Test(dependsOnMethods="TC01")
	public void TC02() throws Exception
	{
		System.out.println("tc02");
	}
	
	@Test
	public void TC03() throws Exception
	{
		System.out.println("tc03");
	}
	

}
