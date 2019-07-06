package TestNG.java;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicTable2 {
	
	
	public static WebDriver $;

	public static void main (String [] args) throws InterruptedException {
		
			
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	    $ = new ChromeDriver();
	    $.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		$.manage().window().maximize();
		$.get("https://www.toolsqa.com/");
		MouseHover("Automation Practice Table");
		
		List<WebElement> column = $.findElements(By.xpath("//*[@id=\"content\"]/table/thead/tr/th"));
		int size = column.size();
		System.out.println("Column is" + size);
		
		List<WebElement> Row = $.findElements(By.xpath("//*[@id=\"content\"]/table/tbody/tr/th"));
		int size2 = Row.size();
		System.out.println("Row is" + size2);
		
		
		for(int i = 1; i<=Row.size(); i++) {
			String Name = $.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr["+i+"]/th")).getText();
			if(Name.contains("Financial Center")) {
				for(int j=1; j<column.size(); j++) {
					String Name2 = $.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
					if(Name2=="details")
						break;
					System.out.println(Name2);
					

				}
			}
		}
		
		
		
		
		
		
		
		

	}
	
	public static void MouseHover(String LinkText) throws InterruptedException {
		Actions Action= new Actions($);
		Action.moveToElement($.findElement(By.xpath("//nav[@class='navigation']/ul/li[7]/a/span[@class=\"menu-item-text\"]"))).build().perform();
		Thread.sleep(3000);
		$.findElement(By.linkText(LinkText)).click();
		
	}

}
