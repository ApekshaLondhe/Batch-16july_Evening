package neoStockPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PopUp_of_HomePage {
	
	@FindBy (xpath = "(//div[@class=\"modal show\"])[1]//button//span") private WebElement popup;
    @FindBy(xpath="(//div[@class=\"modal show\"]//div)[29]//a") private WebElement plansPopup;

	public PopUp_of_HomePage(WebDriver driver)	
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Click_popup()
	{
		popup.click();
	}
	
	public void closeButton_plansPopup()
	{
		plansPopup.click();
	}
	
	
}
