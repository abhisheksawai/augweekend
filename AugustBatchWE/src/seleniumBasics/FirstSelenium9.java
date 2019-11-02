package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium9 {

	public static void main(String[] args) {			
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\August Weekend\\jar\\chromedriver76.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("1231231");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("567654");
			
		
	}
}
