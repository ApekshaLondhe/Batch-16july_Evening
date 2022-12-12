package neoStockPOM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStockUtility.Utility_Class;



public class Password_page {
	
	
@FindBy(xpath = "//input[@id=\"txt_accesspin\"]")private WebElement password;
@FindBy(id = "lnk_submitaccesspin") private WebElement submitButtion;

public Password_page(WebDriver driver) {
	
	PageFactory.initElements(driver,this);
}

public void EnterPassword(WebDriver driver,String passcode)
{
	Utility_Class.Wait(driver, 500);
	password.sendKeys(passcode);
	Reporter.log("Entering the password", true);
}

public void clickSubmitButtion(WebDriver driver)
{
	//Utility_Class.Wait(driver, 500);
	submitButtion.click();
	Reporter.log("clicking on submitButtion", true);
	
}

}
