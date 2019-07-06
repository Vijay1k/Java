package TestNG.java;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WindowHandle {
	
	static WebDriver $;

	public static void main(String [] args) {
		

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
	    $ = new ChromeDriver();
	    $.manage().window().maximize();
		$.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		$.findElement(By.id("button1")).click();
		
	   Set<String> Windows= $.getWindowHandles();
		
	   Iterator <String> IT = Windows.iterator();
		
	   String Parent = IT.next();
	   String Child = IT.next();
	   
	   $.switchTo().window(Child);
	   
	   $.manage().window().maximize();
	   
	 String Label =  $.findElement(By.xpath("//*[text()='Automation Tools Tutorial']")).getText();
	System.out.println(Label);
	Assert.assertEquals(Label, "Automation Tools Tutorial", "Testing");
	
	}
	
	public void clickON(WebElement locator, WebDriver driver, int time) {
		new WebDriverWait(driver, time).ignoring(StaleElementReferenceException.class).
		until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}

}
