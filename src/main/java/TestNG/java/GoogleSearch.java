package TestNG.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	
	public static void main (String [] args) throws InterruptedException {
		
		WebDriver $;
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
	    $ = new ChromeDriver();
	    $.manage().window().maximize();
	    $.get("https://www.google.com");
	    $.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Selenium");
	    
	    List<WebElement> list = $.findElements(By.xpath("//ul[@class='erkvQe']//li/descendant::div[@class='sbl1']"));
	    Thread.sleep(5000);
	    System.out.println(list.size());
	    
	    for(int i =0; i<=list.size(); i++) {
	    	if(list.get(i).getText().contains("Selenium Testing")) {
	    		list.get(i).click();
	    	}
	    }
	}
}
