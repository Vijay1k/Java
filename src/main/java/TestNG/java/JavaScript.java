package TestNG.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	
	public static WebDriver Driver;

	public static void main(String [] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
	    Driver = new ChromeDriver();
	    Driver.manage().window().maximize();
	    Driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    Driver.get("https://www.google.com");
	    alerts(Driver, "Message Displayed");
	    Thread.sleep(3000);
	    
	    Alert al = Driver.switchTo().alert();
	    al.dismiss();
	    
	    click(Driver, Driver.findElement(By.xpath("//a[text()='Gmail']")));
	    Thread.sleep(3000);
	    refresh(Driver);
	    
	    String T = title(Driver);
	    System.out.println(T);
	    
		String A = allText(Driver);
		System.out.println(A);
		
		
		scroll(Driver);
		
	}
	
	public static void alerts(WebDriver Driver, String Message) {
		JavascriptExecutor Js = ((JavascriptExecutor)Driver);
		Js.executeScript("alert('"+Message+"')");
	}
	
	public static void click(WebDriver Driver, WebElement locator) {
		JavascriptExecutor js = ((JavascriptExecutor)Driver);
		js.executeScript("arguments[0].click();", locator);	
	}
	
	public static void refresh(WebDriver Driver) {
		JavascriptExecutor js = ((JavascriptExecutor)Driver);
		js.executeScript("history.go(0)");
	}
	
	public static String title(WebDriver Driver) {
		JavascriptExecutor js = ((JavascriptExecutor)Driver);
		String s = js.executeScript("return Document.title;").toString();
		return s;
	}
	public static String allText(WebDriver Driver) {
		JavascriptExecutor js = ((JavascriptExecutor)Driver);
		String s = js.executeScript("return Document.Document Element.innerText;").toString();
		return s;
	}
	public static void scroll(WebDriver Driver) {
		JavascriptExecutor js = ((JavascriptExecutor)Driver);
		js.executeScript("Window.scrollTo(0,Document.body.scrollHeight)");
	}
}
