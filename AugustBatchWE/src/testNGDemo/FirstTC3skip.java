package testNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTC3skip {
	
	@Test(enabled=false)
	public void TC01() throws Exception
	{
		System.out.println("tc01");
	}
	
	@Test
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
