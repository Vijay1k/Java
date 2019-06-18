package RetryLogic;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	
	
	static int count = 0;
	
	static int limit = 1;
	
	public boolean retry(ITestResult result) {
		
		if(count<=limit) {
			count++;
			return true;
		}
		
		return false;
	}

}
