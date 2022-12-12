package neoStockPOM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStockUtility.Utility_Class;



public class neoStock_popup {
	
	@FindBy(xpath = "(//a[text()=\"OK\"])[2]")private WebElement OKbuttion;
	@FindBy(xpath = "(//a[text()=\"Close\"])[5]")private WebElement closePopup;
	@FindBy(id = "lbl_username") private WebElement userid;
	@FindBy(id = "lbl_curbalancetop")private WebElement acbalnce;
	@FindBy(xpath = "//span[text()=\"Logout\"]") private WebElement logout;
	
    public neoStock_popup(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void clickOkpopup(WebDriver driver) throws InterruptedException
    {
    	if(OKbuttion.isDisplayed())
    	{
    		Utility_Class.Wait(driver, 1000);
        	OKbuttion.click();
        	Utility_Class.Wait(driver, 1000);
        	Reporter.log("clicking on ok buttion", true);
    	}
    	else {
    		Reporter.log("there no popup", true);
    		Thread.sleep(1000);
    	}
    }
    
    public void clickOkClose(WebDriver driver) throws InterruptedException
    {
    	if(closePopup.isDisplayed())
    	{
    		Utility_Class.Wait(driver, 1000);
    		closePopup.click();
    		Reporter.log("click on close popup", false);
    	}
    	else {
    		Thread.sleep(1000);
    	}
    	
    }
    public  String Getactual_useri()
	{
		String ActualID = userid.getText();
		String realUid = ActualID.substring(3);		
		Reporter.log("getting Acual userId "+realUid, true);
		return ActualID;
	}
	
	public  String Getactual_ACbalnce()
	{
		String ActualBalnce = acbalnce.getText();
		Reporter.log("getting Acual ACbalnce", true);
		return ActualBalnce;
	}
	
	public void logoutNeo(WebDriver driver)
	{ 
		Utility_Class.Wait(driver, 1000);
		userid.click();
		Utility_Class.Wait(driver, 1000);
		logout.click();
		Reporter.log("logging out neostock", true);
	}


    
}
