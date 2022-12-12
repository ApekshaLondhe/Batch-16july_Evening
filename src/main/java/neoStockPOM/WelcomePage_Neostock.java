package neoStockPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage_Neostock {
	
	@FindBy(id="MainContent_signinsignup_lnk_tradepanel3") private WebElement MyPanalButton;
	@FindBy(xpath = "//div[@class=\"input-group flex-nowrap\"]//input") private WebElement mobileNO;
	@FindBy(xpath = "//a[@id=\"lnk_signup1\"]")private WebElement signup;

	
	public WelcomePage_Neostock(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clicksignUp_Buttion()
	{
		signup.click();
	}
	
	public void EntermobilNO()
	{
		mobileNO.sendKeys("9175846391");
		signup.click();
		
		
	}
	
	
	public void click_mypsnslButton()
	{
		 MyPanalButton.click();
	}
	
	
	
	
}


