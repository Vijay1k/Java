package TestNG.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class Headless {

	@Test
	public void headlless() {
		
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		
		FirefoxOptions Fire = new FirefoxOptions();
		Fire.setHeadless(true);
		
		WebDriver Driver = new FirefoxDriver(Fire);
		Driver.get("https://www.google.com");
		System.out.println(Driver.getTitle());
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		ChromeOptions Chrome = new ChromeOptions();
		Chrome.setHeadless(true);
		
		WebDriver Driver2 = new ChromeDriver(Chrome);
		Driver2.get("https://www.google.com");
		System.out.println(Driver2.getTitle());
		
		
		
	}
	
	
}
