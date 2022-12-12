package neoStockUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility_Class {
	
	
	
	 //comman method for taking scrrenshot
	
	public static void TakeScreenShot(WebDriver driver,String Screendhotname) throws IOException
	{
		Wait(driver, 500);
		File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Dist=new File("C:\\Users\\user\\Pictures\\Screenshots\\"+Screendhotname+".png");
		FileHandler.copy(Src, Dist);
		
	}
	
	//comman method for excelReading
	public static  String excelReading(int Row,int cell) throws EncryptedDocumentException, IOException
	{
		//Wait(driver, 500);
		File myfile=new File("C:\\Users\\user\\Downloads\\SelinumFiles\\16julyEven.xlsx");
		String Value = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(Row).getCell(cell).getStringCellValue();
		Reporter.log("readdata from excel", true);
		return Value;
	}
	
	//comman method for scrolling
	public static void scrollingintoview(WebDriver driver,WebElement element)
	{
		Wait(driver, 500);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Reporter.log("Scroll in view", true);
	}
	
	//comman method for wait
	public static void Wait(WebDriver driver,int wait)
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(wait));
		Reporter.log("Waiting for"+wait+"ms", true);
	}
	
	

}
