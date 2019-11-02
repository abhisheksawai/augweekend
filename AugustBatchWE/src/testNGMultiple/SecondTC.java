package testNGMultiple;

import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondTC {
	
	@Test
	public void STC01() throws Exception
	{
		System.out.println("STC01");
		Logger log = Logger.getLogger("log demo");
		PropertyConfigurator.configure("log4j.properties");
		
		log.info("browser launcher");

	}
	
	@Test
	public void STC02() throws Exception
	{
		System.out.println("STC02");
	}
	

}
