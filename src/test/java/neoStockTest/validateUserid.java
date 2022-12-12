package neoStockTest;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import neoStockBase.Base;
import neoStockPOM1.Password_page;
import neoStockPOM1.Sign_inneo;
import neoStockPOM1.Sign_up_page;
import neoStockPOM1.neoStock_popup;
import neoStockUtility.Utility_Class;



public class validateUserid extends Base {
	//WebDriver driver;
	Sign_up_page  login;
	Password_page pass;
	neoStock_popup popup; 
	Sign_inneo sign;
	@BeforeClass
	public void lonchNeostock() throws InterruptedException
	{
		 lonchUrl();
		 login=new Sign_up_page(driver);
		 pass=new Password_page(driver);
		 popup=new neoStock_popup(driver);
		 sign = new Sign_inneo (driver);
	}
	@BeforeMethod
	public void loginNeostock() throws EncryptedDocumentException, IOException, InterruptedException
	{   sign.ClickSign(driver);
	   //login.clicksingnup();
        Thread.sleep(6000);
		login.EntermobileNumber(driver, Utility_Class.excelReading(1, 0));
		//login.clicksignupButtion();
		Reporter.log("Login successful.....", true);
		Thread.sleep(3000);
		pass.EnterPassword(driver, Utility_Class.excelReading(1, 1));
		Thread.sleep(1000);
		pass.clickSubmitButtion(driver);
		Thread.sleep(1000);
		Reporter.log("go to home page", true);
		popup.clickOkpopup(driver);
		Thread.sleep(1000);
		popup.clickOkClose(driver);
		Reporter.log("handling popups", true);
		//login.clickSignINButtion();
		//login.clicksignupButtion();
		//Utility_Class.Wait(driver, 3000);
	}
		
  @Test
  public void validateUID() throws EncryptedDocumentException, IOException {
	  
	 Assert.assertEquals(popup.Getactual_useri(), Utility_Class.excelReading(1, 2));
	 Utility_Class.TakeScreenShot(driver,popup.Getactual_useri() );
	 Reporter.log("Testcase is pass", true);
	 Utility_Class.Wait(driver, 3000);
  }
  
  @Test
  public void validateACbalance() throws EncryptedDocumentException, IOException
  {
	  Assert.assertEquals(popup.Getactual_ACbalnce(), Utility_Class.excelReading(1, 3));
	  Reporter.log("validate Ac balce test case is pass", true);
	 // Utility_Class.TakeScreenShot(driver,acc );
  }
  
  @AfterMethod
  public void logout_neostock()
  {
	  popup.logoutNeo(driver);
  }
  @AfterClass
  public void closeBroser()
  {
	  driver.close();
  }
	  
  
  //@Test
 // public void validateACbalance() throws EncryptedDocumentException, IOException
  //{
	 // Assert.assertEquals(popup.Getactual_ACbalnce(), Utility_Class.excelReading(1, 3));
	 // Reporter.log("validate Ac balce test case is pass", true);
	 // Utility_Class.TakeScreenShot(driver, );
 // }
}
