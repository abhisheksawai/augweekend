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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mousehover1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\August Weekend\\jar\\chromedriver76.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement desti = driver.findElement(By.xpath("//p[text()='Drop here']"));
			
		Actions act = new Actions(driver);
		//act.contextClick(eleElectroni).build().perform();
		act.dragAndDrop(source, desti).build().perform();
		
		//act.moveToElement(eleElectroni).build().perform();

				
	}

}
