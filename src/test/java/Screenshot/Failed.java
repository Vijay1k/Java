package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Failed {
	
	
	static WebDriver Driver;
	
	public static void Screenshot1() {
		
		File shot = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(shot, new File("D:\\Project Selenium\\java\\Screenshots\\name.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
		
	}

}
