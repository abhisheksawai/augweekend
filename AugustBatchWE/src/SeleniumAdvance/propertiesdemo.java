package SeleniumAdvance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class propertiesdemo {

	@Test
	public void TCcheckORProp() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\August Weekend\\jar\\chromedriver76.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.paytm.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div/div[2]/div[1]/div/div/div[2]/div[2]/ul/li[1]/div/div/input")).sendKeys("9403115588");
		//driver.findElement(By.xpath("mobile")).sendKeys("9403115588");
		
		File src = new File("E:\\World Of Program\\AugustBatchWE\\kuchbhiOR.properties");
		FileInputStream fis = new FileInputStream(src);
		Properties pro = new Properties();
		pro.load(fis);
		
		File srcTD = new File("E:\\World Of Program\\AugustBatchWE\\kuchbhiTestData.properties");
		FileInputStream fisTD = new FileInputStream(srcTD);
		Properties proTD = new Properties();
		proTD.load(fisTD);
		
		//driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div/div[2]/div[1]/div/div/div[2]/div[2]/ul/li[1]/div/div/input")).sendKeys("9403115588");
		//driver.findElement(By.xpath(pro.getProperty("mobile"))).sendKeys("9403115588");
		driver.findElement(By.xpath(pro.getProperty("mobile"))).sendKeys(proTD.getProperty("rechargemobilenumber"));
		
		
	}
	
}
