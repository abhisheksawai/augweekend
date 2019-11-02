package SeleniumAdvance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xdgf.usermodel.section.geometry.GeometryRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excelReading {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\August Weekend\\jar\\chromedriver76.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.paytm.com/");
		
		
		// Specify the path of file excel ka path
		File src = new File("C:\\Users\\lenovo\\Desktop\\August Weekend\\augweekend.xlsx");
		
		// load file
		FileInputStream fis = new FileInputStream(src);
	
		// load workbook		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//read sheet
		XSSFSheet sh1 = wb.getSheetAt(0);
		//XSSFSheet sh1 = wb.getSheet("Sheet1");
		
		//excel index starting from zero
		String row1col1= sh1.getRow(1).getCell(1).getStringCellValue();		
		//String row1col1= sh1.getRow(i).getCell(j).getStringCellValue();		
		System.out.println(row1col1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(row1col1);
		
	}

}
