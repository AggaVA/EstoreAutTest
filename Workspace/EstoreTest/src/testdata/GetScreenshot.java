package testdata;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GetScreenshot {
	
	public static String captureScreenshot (WebDriver driver, String screenshotName){
		
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String dest = "C:\\EstoreAutomation\\Screenshots\\" + screenshotName + ".png";
			File destination = new File(dest);
			
			FileUtils.copyFile(source, destination);
				
			return dest;
			} 
		
		catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			return e.getMessage();
			}
			
		}

}
