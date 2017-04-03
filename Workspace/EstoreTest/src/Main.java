import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class Main {
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C://EstoreAutomation//Webdriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://staging.electrical.coop.co.uk/");
		
		String title = driver.getTitle();
		
		if (title.contains("Co-op Electrical")){
			System.out.println("Pass "+title);
		}
		else{
			System.out.println("Fail");
		}
		
		driver.close();
	}

}
