 package com.opencart.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.opencart.testBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener  {

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Testcase execution started - "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Testcase execution completed - "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Testcase execution failed -" +result.getName());
		UtilClass.takeSS(result.getName()+"-" +System.currentTimeMillis());
		logger.info("Take Screenshot");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Testcase execution skipped -"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
