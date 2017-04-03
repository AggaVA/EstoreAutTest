package pageObjects;

import org.openqa.selenium.WebDriver;

public class BasketPage extends AbstractPage {

	public BasketPage(WebDriver driver) {
		super(driver);
		
	}
	
	public boolean isAtPage(){
		return driver.getTitle().contains("Basket");
	}
	

}
