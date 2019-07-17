package Singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver Driver= null;
	
	public static String browser = "Chrome";
 
 public static void initialize() {
	 
	
	 if(Driver==null) {
		 
	 if (browser.contains("Chrome")) {
	 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	 Driver = new ChromeDriver();
	 Driver.manage().window().maximize();
	 Driver.get("https://www.facebook.com");
	 }
	 }
 }

}
