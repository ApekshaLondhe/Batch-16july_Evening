package neoStockUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility_newOne {
	
	
	//write the comman method for takeScreenShot
	public static void takeSC(WebDriver driver,String name) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dist=new File("C:\\Users\\user\\Pictures\\Screenshots\\"+ name +".png");
		FileHandler.copy(src, dist);
		Reporter.log("Taking Screenshot......", true);
	}
	
	//write the comman method for wait
	public static void Wait(WebDriver driver,int sec)
	{	 
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(sec));
	Reporter.log("waiting for just "+sec , true);
	}
	
	//write the comman method for propertis file
	
	public static String readDataFromPropertisFILE(String key) throws IOException
	{
		//create the object of propertis file--->>given by the java
		Properties prop=new Properties();
		
		//create the object of fileInputsteme class object --->>given by java
		
		FileInputStream myfile=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\16JUL_A_EVEN_MAVEN_PROJECT\\Neostock.properties");
		 prop.load(myfile);
		 
		String value = prop.getProperty(key);
		System.out.println(value);
		return value;
	}
	
	
	

}
