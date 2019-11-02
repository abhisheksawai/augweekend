package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webtable2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\August Weekend\\jar\\chromedriver76.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();		
		String companyname = "Sun Retail";		
		List<WebElement> rowa = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		//a.size();
		List<WebElement> col = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td"));
		
		
		System.out.println(driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[4]/td[1]")).getText());		
		//String runcomp = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[4]/td[1]")).getText();		
		String name = "//*[@id='leftcontainer']/table/tbody/tr[";
		String name2= "]/td[1]";
		
		for(int i=1; i<=10;i++)		
		{
			//String runcomp = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[i]/td[1]")).getText();
			//String runcomp = driver.findElement(By.xpath(name+i+name2)).getText();
			
		String runcomp = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td[1]")).getText();
			String runcomp1 = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[i]/td[1]")).getText();
			
			System.out.println(runcomp);
			if(companyname.equals(runcomp))
			{
				System.out.println(driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[4]/td[4]")).getText());		
			}
		}
	}
}
