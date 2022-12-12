package neoStockPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp_Neostock {
	
	@FindBy(xpath = "//a[@id=\"lnk_signup1\"]")private WebElement signup;

	public SignUp_Neostock(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clicksignUp_Buttion()
	{
		signup.click();
	}
	
	
	
	
	

}
