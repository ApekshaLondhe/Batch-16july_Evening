package neoStockTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import neoStockPOM.Home_page_Neostock;
import neoStockPOM.Password_Page_Neostock;
import neoStockPOM.PopUp_of_HomePage;
import neoStockPOM.SignUp_Neostock;
import neoStockPOM.WelcomePage_Neostock;

public class Test_neostock {
	SoftAssert soft =new SoftAssert();
	WebDriver driver;
	WelcomePage_Neostock welcome;
	Password_Page_Neostock passcode;
	PopUp_of_HomePage popups;
	Home_page_Neostock Home;
	SignUp_Neostock sign;
  @BeforeMethod
  public void LounchBrowser() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		 driver= new ChromeDriver();
		 Thread.sleep(1000);
		 driver.get("https://neostox.com/");
		 Thread.sleep(1000);
		 welcome=new WelcomePage_Neostock(driver);
		 passcode=new Password_Page_Neostock(driver);
		  popups=new PopUp_of_HomePage(driver);	
		 Home=new Home_page_Neostock(driver);
		 sign=new SignUp_Neostock(driver);
		 Thread.sleep(1000);
		 
  }
  
  @BeforeMethod
  public void login_Neostock() throws InterruptedException
  {
	//welcome.clicksignUp_Buttion();
	  sign.clicksignUp_Buttion();
	  welcome.EntermobilNO();  
	  Thread.sleep(1000);
	  passcode.EnterPassword();
	  Thread.sleep(1000);
	  passcode.Click_submitbuttion();
	  Thread.sleep(1000);
	  Reporter.log("Browser is lounch", true);
	  Thread.sleep(1000);
	  popups.Click_popup();
	  Thread.sleep(1000);
	  popups.closeButton_plansPopup();
	  Thread.sleep(1000);
	  //Reporter.log("test case ",true);
	  Thread.sleep(1000);
	  
  }
  
  
  @Test
  public void validateUID()
  {
	  String expected="Hi Apeksha Londhe";
	  String actulID = Home.getactualid(driver);
	  soft.assertEquals(actulID, expected,"Both are match then test case pass");
	  soft.assertAll();
  }
  //@Test 
// public void ValidateB() throws InterruptedException
//{  Thread.sleep(1000);
	// String expectedBalnce="Rs.5,00,000.00";
	// Thread.sleep(5000);
	//String Actual = Home.getbalnce(driver);
	//soft.assertEquals(Actual, expectedBalnce);
	//System.out.println( Actual);
	//soft.assertAll();
	 
 // }
  
 //@Test
 //public void BALANCE()
 //{
  //String expectedBalnce="Rs.5,00,000.00";
  //String ACTUAL="Rs.5,00,000.00";
 // soft.assertEquals(ACTUAL, expectedBalnce);
  //soft.assertAll();
 // }
 
 @Test
 public void validateBalance()
 {
	 String ACtualBalnce = driver.findElement(By.xpath("//span[@id=\"lbl_curbalancetop\"]")).getText();
	 System.out.println(ACtualBalnce);
	 String Expected="Rs.5,00,000.00";
	 System.out.println(Expected);
	 soft.assertEquals(ACtualBalnce, Expected);
	 soft.assertAll();
 }

  
}
