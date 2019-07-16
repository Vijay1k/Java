package TestNG.java;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick { 
	
	static WebDriver Driver;
	
	public static void main (String [] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		Driver= new ChromeDriver();
		Driver.manage().window().maximize();
		
		Driver.navigate().to("https://www.google.com");
		WebElement Link = Driver.findElement(By.linkText("Gmail"));
		
		Actions action = new Actions(Driver);
		action.contextClick(Link).build().perform();
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		
		Set<String> Window = Driver.getWindowHandles();
		
		Iterator<String> IT = Window.iterator();
		
		String Parent = IT.next();
		String Child = IT.next();
		
		Driver.switchTo().window(Child);
		
		String Title = Driver.getTitle();
		System.out.println(Title);
		
		
	}

}
