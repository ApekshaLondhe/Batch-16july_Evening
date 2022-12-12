package neoStockTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import neoStockPOM.Home_page_Neostock;
import neoStockPOM.Password_Page_Neostock;
import neoStockPOM.PopUp_of_HomePage;
import neoStockPOM.SignUp_Neostock;
import neoStockPOM.WelcomePage_Neostock;

public class Neostock_Test {



	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\SelinumFiles\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 Thread.sleep(1000);
		 driver.get("https://neostox.com/");
		 Thread.sleep(1000);
		 
	System.out.println("=========lounch welcomePage==============");	
	SignUp_Neostock  sign=new SignUp_Neostock(driver);
	sign.clicksignUp_Buttion();
		
		WelcomePage_Neostock welcome=new WelcomePage_Neostock(driver);
		//welcome.clicksignUp_Buttion();
		welcome.EntermobilNO();
		//welcome.click_mypsnslButton();
		Thread.sleep(4000);
		//welcome.clicksignUp_Buttion();
		
	System.out.println("=========lounch PasswordPage==============");	
		Password_Page_Neostock passcode=new Password_Page_Neostock(driver);
		passcode.EnterPassword();
		passcode.Click_submitbuttion();
		
		Thread.sleep(2000);
	System.out.println("=========handled popups of homepage==============");	
		
		PopUp_of_HomePage popups=new PopUp_of_HomePage(driver);
		popups.Click_popup();
		popups.closeButton_plansPopup();
	System.out.println("===========validate balance, and userid ============");		
		Home_page_Neostock Home=new Home_page_Neostock(driver);
		Home.validateuserid();
		Home.checkBalnce();
	Home.getbalnce(driver);
		
	

	}

}
