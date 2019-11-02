package seleniumBasics;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class checkboxRadio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\August Weekend\\jar\\chromedriver76.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//List <WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		try {
			 // now copy the  screenshot to desired location using copyFile //method
			FileUtils.copyFile(src, new File("C:\\Users\\lenovo\\Desktop\\August Weekend\\error.png"));
		}
	 
		catch (IOException e)
		 {
	 		 System.out.println(e.getMessage());
	 
		 }

		
		
	
		
		
	}

}
