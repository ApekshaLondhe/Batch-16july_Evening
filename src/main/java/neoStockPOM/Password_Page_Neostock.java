package neoStockPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Password_Page_Neostock {
	
	@FindBy (name = "ctl00$MainContent$_wp_enteraccesspin$txt_accesspin")private WebElement password;
	@FindBy(id="lnk_submitaccesspin") private WebElement submitButtion;
	
	public Password_Page_Neostock(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
	public void EnterPassword()
	{
		password.sendKeys("4132");
	}
	
	public void Click_submitbuttion()
	{
		submitButtion.click();
	}
	
	
	
	

}
