package TestNG.java;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	
	static WebDriver Driver;
	
	public static void main (String [] args) throws IOException  {
		
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
	    Driver = new ChromeDriver();
	    Driver.manage().window().maximize();
	    Driver.get("https://freecrm.com/");
	    Driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
	    Driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ashlyvijay@gmail.com");
	    Driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Nstseessfs@1992");
	    Driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	    
	    //Getting the total list of links available in page
	    
	    List<WebElement> List = Driver.findElements(By.tagName("a"));
	    List.addAll(Driver.findElements(By.tagName("img")));
	    System.out.println(List.size());
	    
	    
	    List <WebElement> List2 = new ArrayList<WebElement>();
	    
	    for(int i =0; i<List.size(); i++) {
	    	if(List.get(i).getAttribute("href") !=null && (!List.get(i).getAttribute("href").contains("Javascript"))) {
	    		System.out.println(List.get(i).getAttribute("href"));
	    		List2.add(List.get(i));
	    	}
	    }
	    System.out.println(List2.size());
	    
	    for (int j=0; j<List2.size(); j++) {
	    	
	    	HttpURLConnection Connection = (HttpURLConnection)new URL(List2.get(j).getAttribute("href")).openConnection();
	    	
	    	Connection.connect();
	    	String Message = Connection.getResponseMessage();
	    	Connection.disconnect();
	    	System.out.println(List2.get(j).getAttribute("href")+"  "+Message);
	    	
	    }
	    	
	   
	}
		
	

}
