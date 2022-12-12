package orangeHRM_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrengeHRM_LoginPage {
	
		@FindBy(name = "username") private WebElement username;
		@FindBy(name = "password") private WebElement password;
		@FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")private WebElement loginButtion;
		
		public OrengeHRM_LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void ENTERusername()
		{
			username.sendKeys("Admin");
		}
		
		
		public void ENTERpassword()
		{
			password.sendKeys("admin123");
		}
		
		
		public void ClickLoginButtion() throws InterruptedException
		{
			loginButtion.click();
			Thread.sleep(6000);
		}
		

	}


