package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import page.addCustomerPage;
import util.Browserfactory;

public class addCustomerTest {
	  WebDriver driver;
	  String username= "demo@techfios.com";
	  String password= "abc123";
	  
//	  /	By creating an Object
//		By the name of the Class

		@Test
		public void validUserShouldBeAbleToAddCustomer() {
	  
			driver =Browserfactory.init();
		driver=Browserfactory.init();

		//	LoginPage loginPage1 = new LoginPage();
			LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	   	loginPage.insertUserName(username);
			loginPage.insertPassword(password);
			loginPage.clickOnSignInButton();

			DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
			dashboard.verifyDashboardPage();
			dashboard.clickcustomerelemet();
			dashboard.clickaddcustomerelement();
			
			
			addCustomerPage AddCustomerPage= PageFactory.initElements(driver, addCustomerPage.class);
			AddCustomerPage.insertFullName("Lolan");
			AddCustomerPage.selectCompany("Techfios");
			AddCustomerPage.insertEmailElement("dec@gmail.com");
			AddCustomerPage.selectCounrty("Belgium");
			
			
			
			//	Browserfactory.tearDown();
		}
}
