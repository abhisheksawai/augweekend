package seleniumBasics;

import org.openqa.selenium.By;

public class forloopvaribale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Abhishek";
		String name2 = "vishal";
		for(int i=1; i<= 3 ; i++)
		{
			//System.out.println(i);
			System.out.println("Abhishek" +i+ "vishal");
			System.out.println("Abhishek[i]vishal");
			
		//	String runcomp = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[i]/td[1]")).getText();
			//System.out.println(name+i+name2);
		}

		
		//Abhishek 1 vishal
		//abhishek 2 vishal
		//abhishek 3 vishal
	}

}
