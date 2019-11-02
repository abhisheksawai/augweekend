package seleniumBasics;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logforjExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\August Weekend\\jar\\chromedriver76.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		Logger log = Logger.getLogger("log demo");
		PropertyConfigurator.configure("log4j.properties");
		
		log.info("browser will launch now");
		driver.navigate().to("https://www.facebook.com/");
		log.info("browser launched done");
		driver.navigate().back();
		log.info("browser back navigated done");
		driver.navigate().forward();
		log.info("browser forward navigated done");
		driver.navigate().refresh();
		log.info("browser refresh done");
		log.info("----------------Execution done-------------");
		
	}

}
