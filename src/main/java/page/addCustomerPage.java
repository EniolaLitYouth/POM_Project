package page;

import java.util.Random;

import javax.swing.Spring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addCustomerPage extends Basepage{
	 
	WebDriver driver;

public addCustomerPage(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='account']")
	WebElement FULLMANE_ELEMENT;
	@FindBy(how =How.XPATH, using ="//select[@name='cid']")
	WebElement COMPANY_ELEMENT;
	@FindBy(how= How.XPATH, using = "//*[@id='email']")
	WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]")
	WebElement COUNTRY_ELEMENT;
	

	public void insertFullName(String fullname) {
		FULLMANE_ELEMENT.sendKeys(fullname + generateRandomNo(999));
//Random rdm= new Random();
//rdm.nextInt(999);
//generateRandomNo(999);
	}
 public void selectCompany(String company) {
//elect sel =new Select(COMPANY_ELEMENT);
//el.selectByVisibleText(company);
 
  selectFromDropDown(COMPANY_ELEMENT,company);
 }

public void insertEmailElement(String email) {
	
	EMAIL_ELEMENT.sendKeys(email);
	
}

 public void selectCounrty(String country) {

selectFromDropDown(COUNTRY_ELEMENT,country);
 
 
 }
	
	

}



		









	
//}
