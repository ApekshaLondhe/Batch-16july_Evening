package orangeHRM_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrengeHRM_HomePage {
	
	@FindBy(xpath = "//p[@class=\"oxd-userdropdown-name\"]")private WebElement username;
	
	
	public OrengeHRM_HomePage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void ValidateUID()
	{
		String actualUID = username.getText();
		System.out.println(actualUID);
		String expectedUID="Paul Collings";
		
		if(actualUID.equals(expectedUID))
		{
			System.out.println(" actual and expected match test case is pass");
		}
		else {
			System.out.println("actual and expected not match then test case fail");
		}
	}

}
