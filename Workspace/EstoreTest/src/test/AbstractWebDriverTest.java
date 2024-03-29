package test;

//import java.util.List;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import pageObjects.LandingPage;
//import testdata.ExcelFileHandler;

public class AbstractWebDriverTest {
	
	protected WebDriver driver;
	protected LandingPage onLandingPage;
	protected ExtentReports report;
	protected ExtentTest logger;
	

	
	@BeforeTest
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver", "C://EstoreAutomation//Webdriver//chromedriver.exe");
		driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		onLandingPage = new LandingPage(driver);	
		report = new ExtentReports("C:\\EstoreAutomation\\TestReports\\LatestReport.html");
			
	}
	
	@AfterTest
	public void testCleanUp(){
		
		driver.close();	
	}
	


}
