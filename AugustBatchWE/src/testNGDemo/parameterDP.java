package testNGDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class parameterDP {
	
	@Test(dataProvider="mydata")
	public void loginwithdiffData(String uname, String pwd)
	{
		System.out.println(uname+pwd);
	}
	
	
	@DataProvider
	public Object[][] mydata()
	{
		Object arr[][] = new Object[2][2];
		arr[0][0] = "abhishek@gmail.com";
		arr[0][1] = "password@1234";
		arr[1][0] = "jayanta@gmail.com";
		arr[1][1] = "P@ss@12344";
		
		return arr;
		
	}

}
