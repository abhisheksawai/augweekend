package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\August Weekend\\jar\\chromedriver76.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//we have xpath of day - //select[@id='day'] tagname is select
		
		//System.out.println(driver.findElement(By.xpath("//select[@id='month']")).getSize());
		
		Select s = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		System.out.println(s.getFirstSelectedOption().getText());
	//	s.selectByIndex(3);
	//	s.selectByValue("4");
	//	s.selectByVisibleText("Jul");
		
		System.out.println(s.getOptions().size());
		
		//System.out.println(s.getOptions().get);
		
		
	}

}
