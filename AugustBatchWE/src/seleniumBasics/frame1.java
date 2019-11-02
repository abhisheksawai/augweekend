package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\August Weekend\\jar\\chromedriver76.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.switchTo().frame("fr1fr3r4id of your frame");
		driver.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
		driver.switchTo().defaultContent();
		
		
	}

}
