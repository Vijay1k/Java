package RetryLogic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Screenshot.Failed;


//@Listeners(Screenshot.ListenerClass.class)
public class RetryTest {
	
	WebDriver driver;
	
	@Test
	public void Method12() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Failed.Screenshot1();
		
		
	}
	
	/*@Test
	public void Method123() {
		Assert.assertEquals(true, false);
	}*/
	
	

}
