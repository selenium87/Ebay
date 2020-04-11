package execution;

import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
WebDriver driver;
	@Test
	public void startup() {
		
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.ebay.com");
		
		
	}
	
	
	
	
	
	public void screen() {
		
	
		
		
	}
	
	
	
	
	
	
	
	
	
}
