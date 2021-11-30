package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Basepage {

	public int generateRandomNo(int boundaryNumber) {
		Random rdm= new Random();
	int generateN=rdm.nextInt(boundaryNumber);
		return generateN;

}

	public void selectFromDropDown(WebElement selectElement,String visisbleText) {
		
		Select sel =new Select(selectElement);
	 sel.selectByVisibleText(visisbleText);
	}


}