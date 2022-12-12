package neoStockPOM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Sign_up_page {
	
	@FindBy(xpath = "//div[@class=\"input-group flex-nowrap\"]//input") private WebElement mobileNO;
	@FindBy(xpath = "//a[@id=\"lnk_signup1\"]")private WebElement signup;	
	//@FindBy(id = "lbl_username") private WebElement userid;
	//@FindBy(id = "lbl_curbalancetop")private WebElement acbalnce;
	
	
	public Sign_up_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void clicksingnup()
	{
		signup.click();
	}
	
	public void EntermobileNumber(WebDriver driver,String mobilenumber)
	{
		mobileNO.sendKeys(mobilenumber);
		signup.click();
		//Reporter.log("Clicking the signup buttion", true);
		Reporter.log("Entering mobile number....", true);
		Reporter.log("Clicking the signup buttion", true);
	}
	
	

}
