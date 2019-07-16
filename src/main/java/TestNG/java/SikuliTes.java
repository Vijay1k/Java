package TestNG.java;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;



public class SikuliTes {

	
	static 	WebDriver Driver;
	public static void main (String [] args) throws FindFailed {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.google.com/");
		
		Screen s = new Screen();
		
		Pattern P = new Pattern("Search.png");
		s.wait(P,2000);
		s.click();
		
		
		
	}
	
	
}
