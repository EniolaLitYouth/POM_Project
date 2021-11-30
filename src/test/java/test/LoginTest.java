package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.Browserfactory;


@Test
public class LoginTest {


	WebDriver driver;
  String username= "demo@techfios.com";
  String password= "abc123";
  
  //	By creating an Object
//	By the name of the Class

	
	public void validUserShouldBeAbleToLoginTest() {
  
		driver =Browserfactory.init();
	//	driver=Browserfactory.init();

//		LoginPage loginPage1 = new LoginPage();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(username);
		loginPage.insertPassword(password);
		loginPage.clickOnSignInButton();

		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.verifyDashboardPage();
		dashboard.clickcustomerelemet();
		dashboard.clickaddcustomerelement();
		
		//		AddCustomerPage.clickaddcustomerelement();
	//	Browserfactory.tearDown();
	}

}
