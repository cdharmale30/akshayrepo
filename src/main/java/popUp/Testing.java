package popUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
	
	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\selelib\\chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open facebook
		driver.get("http://www.facebook.com");
		 
		// Maximize browser
		 
		driver.manage().window().maximize();
		 
		}

}
