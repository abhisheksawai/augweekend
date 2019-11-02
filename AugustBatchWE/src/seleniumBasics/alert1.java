package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class alert1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\August Weekend\\jar\\chromedriver76.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		
	//	driver.switchTo().alert().accept();  // means ok
		driver.switchTo().alert().dismiss();  // means cancel
		driver.switchTo().alert().sendKeys("toalert");  // send to alert
		
		driver.switchTo().defaultContent(); // to come back to default
		
		
	}

}
