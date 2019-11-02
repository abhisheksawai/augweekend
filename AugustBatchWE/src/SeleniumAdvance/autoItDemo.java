package SeleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class autoItDemo {
	
	@Test
	public void uploadword()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\August Weekend\\jar\\chromedriver76.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.pdftoword.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Select your file']")).click();
	}

}
