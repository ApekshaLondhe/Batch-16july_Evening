package neoStockPOM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import neoStockUtility.Utility_Class;



public class Sign_inneo {
	@FindBy(xpath = "(//a[text()=\"Sign In\"])[1]")private WebElement sign;
	
	public Sign_inneo(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public void ClickSign(WebDriver driver)
	{
		Utility_Class.Wait(driver, 1000);
		sign.click();
	}
	

}
