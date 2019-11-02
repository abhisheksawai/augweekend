package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementaction8 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\August Weekend\\jar\\chromedriver76.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();

		//System.out.println(driver.findElement(By.xpath("//input[@type='email']")).getTagName());
		WebElement username = driver.findElement(By.xpath("//button[text()='Recharge Now']"));

		
		
		
		if(username.isSelected())
		{
			System.out.println("yes username is enabled");
		}
		else
		{
			System.out.println("not enabled");
		}
		
		
		
	}

}
