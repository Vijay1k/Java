package TestNG.java;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test123 {
	
	
	
	public static void main(String [] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		ChromeDriver c = new ChromeDriver();
		
		c.quit();
		
	}

}
