package SeleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	
	public WebDriver driver;
	
	By txt_username_Fb= By.xpath("//input[@name='email']");
	By password= By.xpath("//input[@name='pass']");
	By loginbutton= By.xpath("//input[@value='Log In']");
	
//	public loginpage(WebDriver driver){		
//		drivermonica=driver;		
//	}
	
	public loginpage(WebDriver driver){		
		this.driver=driver;		
	}

	
	public void enterusername(String usernmae)
	{	//driver.findElement(By.xpath("//input[@name=username]")).sendKeys("9401334488");
		driver.findElement(txt_username_Fb).sendKeys(usernmae);
	}
		
	public void enterpass()
	{	//driver.findElement(By.xpath("//input[@name=username]")).sendKeys("9401334488");
		driver.findElement(password).sendKeys("pass@1234");
	}
	
	public void clickbutton()
	{	//driver.findElement(By.xpath("//input[@name=username]")).sendKeys("9401334488");
		driver.findElement(loginbutton).click();
		
		
		//idhar hi likh do
	}
	
	
	
	

}
