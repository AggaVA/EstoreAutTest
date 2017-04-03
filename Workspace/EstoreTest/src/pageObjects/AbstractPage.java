package pageObjects;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
	
	protected WebDriver driver;
	
	public AbstractPage(WebDriver driver){
		this.driver = driver;
		
	}
	
	public WebDriver getDriver(){
		return driver;
		
	}
	
	public LandingPage navigateToEtore(){
		driver.navigate().to("https://staging.electrical.coop.co.uk/");	
		return new LandingPage(driver);
	}

}
