package TestNG.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {
	
	public static void main (String [] args) {
WebDriver $;
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
	    $ = new ChromeDriver();
	    $.manage().window().maximize();
	    $.get("http://demo.guru99.com/test/web-table-element.php");
	    
	  List<WebElement>  rows = $.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
	  System.out.println(rows.size());
	  
	  List <WebElement> column = $.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
	  System.out.println(column.size());
	 
	  /*String s = $.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[1]")).getText();
	  System.out.println(s);*/
	  
	  for(int i=1; i<=rows.size(); i++) {
		  String name = $.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td[1]")).getText();
		  if (name.contains("CESC Ltd.")) {
			  for(int j = 1; j<=column.size(); j++) {
				  String name2 = $.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				  
				  System.out.println(name2);
				  }
		  
		  
		  }
		  
		  
	  }
	  
	}

}
