package TestNG.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bootstrap {

	public static WebDriver Driver;

	public static void main(String [] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
	    Driver = new ChromeDriver();
	    Driver.manage().window().maximize();
	    Driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    Driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
	    
	   // ScrollIntoView(Driver, Driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")));
	    Thread.sleep(3000);
	    //Driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
	    clickon(Driver, 30, Driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")));
	    
	    Driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a[text()='Action']")).click();
	    
	}
	
	public static void ScrollIntoView(WebDriver Driver, WebElement Element) {
		JavascriptExecutor Js = ((JavascriptExecutor)Driver);
		Js.executeScript("arguments[0].scrollIntoView(true);", Element);
	}
	
	public static void clickon(WebDriver Driver, int Timeout, WebElement Element) {
		new WebDriverWait(Driver, Timeout).ignoring(ElementClickInterceptedException.class).
		until(ExpectedConditions.elementToBeClickable(Element));
		Element.click();
		
	}
	
	
}
