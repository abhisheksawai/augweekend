package SeleniumAdvance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class verifyloginfb {

	@Test
	public void TCverifyloginfacebook()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\August Weekend\\jar\\chromedriver76.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		loginpage lp = new loginpage(driver);
		
		lp.enterusername("88883115588");
		lp.enterpass();
	//	lp.clickbutton();
		
		
	}
	
}
