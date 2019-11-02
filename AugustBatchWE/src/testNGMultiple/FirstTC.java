package testNGMultiple;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//annotation listern/packagename/classname
@Listeners(testNGMultiple.Itestlistenerdemo.class)
public class FirstTC {
	
	@Test
	public void FTC01() throws Exception
	{
		System.out.println("FTC01 from testcase");
	}
	
	@Test
	public void FTC02() throws Exception
	{
		System.out.println("FTC02 from testcase");
	}
	

}
