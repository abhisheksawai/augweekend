package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium4 {

	public static void main(String[] args) {			
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\August Weekend\\jar\\chromedriver76.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.name("email")).sendKeys("abhishek");
		//driver.findElement(By.id("email")).sendKeys("sharad");
		
		//ideal way to call element , identify element
		driver.findElement(By.className("_1tnO")).click();
		//driver.findElement(by)
		
		
	}
}
