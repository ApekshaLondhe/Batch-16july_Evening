package neoStockPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page_Neostock {
	
	@FindBy (id = "lbl_username")private WebElement userid;
	@FindBy(xpath = "//span[@id=\"lbl_curbalancetop\"]") private WebElement Acbalance;
	
	public Home_page_Neostock(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void validateuserid()
	{
		String Actual = userid.getText();
		System.out.println(Actual);
		String expected="Hi Apeksha Londhe";
		
		if(Actual.equals(expected))
		{
			System.out.println("actual and expected match then my test case is pass");
		}
		else {
			System.out.println("actual and expected not match then my test case is Fail");
		}
		
	}
	
	//method for check balance of neostock
	
	public void checkBalnce()
	{
		String ActualBalnce = Acbalance.getText();
		System.out.println(ActualBalnce);
	}
	
	public String getactualid(WebDriver driver)
	{
		String ActualID = userid.getText();
		return ActualID;
	}
	
	public String getbalnce(WebDriver driver)
	{
		String actualBalnce = Acbalance.getText();
		System.out.println(actualBalnce);
		return actualBalnce;
		
	}
	
	
	
}
