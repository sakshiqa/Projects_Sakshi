package utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer
{
	int initialcount=0;
	int retrycount=2;
	@Override
	public boolean retry(ITestResult result) 
	{
		// TODO Auto-generated method stub	
		if(initialcount<retrycount)
		{
		initialcount++;
		return true;
		
		}
		
		return true;
	}

}
