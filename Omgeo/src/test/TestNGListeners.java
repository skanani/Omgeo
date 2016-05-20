package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener
{

	@Override
	public void onFinish(ITestContext testResults) 
	{
		System.out.println("TC Finished @ : " + testResults.getEndDate());
	}

	@Override
	public void onStart(ITestContext testResults) 
	{
		System.out.println("TC Started @ : " + testResults.getStartDate());
	}

	@Override
	public void onTestFailure(ITestResult testResults) 
	{
		System.out.println("TC Failed and details are : " + testResults.getName());
	}

	@Override
	public void onTestSkipped(ITestResult testResults) 
	{
		System.out.println("TC Skipped and details are : " + testResults.getName());
	}

	@Override
	public void onTestSuccess(ITestResult testResults) 
	{
		System.out.println("TC Passed and details are : " + testResults.getName());		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
