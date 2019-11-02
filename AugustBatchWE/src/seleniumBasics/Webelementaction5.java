package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementaction5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\August Weekend\\jar\\chromedriver76.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.xpath("//input[@type='email']")).getLocation());
		
		Dimension dimesions=(driver.findElement(By.xpath("//input[@type='email']"))).getSize();
		System.out.println("Width : "+dimesions.width);
		System.out.println("Height : "+dimesions.height);

		
		driver.quit();
		
	}

}
