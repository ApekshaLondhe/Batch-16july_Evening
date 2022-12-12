package orengetHRMTEST;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import orangeHRM_POM.OrengeHRM_HomePage;
import orangeHRM_POM.OrengeHRM_LoginPage;

public class Orenge_HRM_testUsername {
    
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		 Thread.sleep(1000);
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 Thread.sleep(1000);
		 Reporter.log("lonching the browser", true);
		 
		 
	OrengeHRM_LoginPage login=new OrengeHRM_LoginPage(driver);
		 login.ENTERusername();
		 login.ENTERpassword();
		 login.ClickLoginButtion();
		 
		 
    OrengeHRM_HomePage	home=new OrengeHRM_HomePage(driver);
    home.ValidateUID();
		 
	}

	

}
