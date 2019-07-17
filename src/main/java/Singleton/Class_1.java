package Singleton;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class_1 extends TestBase{
	
	
	@BeforeMethod
	public void Setup() {
		TestBase.initialize();
	}
	
	@Test
	public void Test1() {
		String URL = Driver.getCurrentUrl();
		System.out.println(URL);
	}
	
	@Test
	public void Test2() {
		String Title = Driver.getTitle();
		System.out.println(Title);
	}

}
