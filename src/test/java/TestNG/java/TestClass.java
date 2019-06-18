package TestNG.java;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestClass {

	
	
	
	@Test()
	public void Method1() {
		Assert.assertEquals(true, false);
	}
	
	
	@Test
	public void Method2() {
		Assert.assertEquals(true, false);
	}
	
	
}
