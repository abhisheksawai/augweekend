package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

	public static void main(String[] args) {			
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\August Weekend\\jar\\chromedriver76.exe");
		//ChromeDriver c = new ChromeDriver();
		//Firefox f = new Firefox();
		//InternetExplorer ie = new InternetExplorer();
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new Firefox();
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new InternetExplorer();
		
		driver.get("https://www.facebook.com/");
		
	}
}
