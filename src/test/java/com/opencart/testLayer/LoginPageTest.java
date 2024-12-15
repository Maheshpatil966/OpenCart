package com.opencart.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pageLayer.HomePage;
import com.opencart.pageLayer.LoginPage;
import com.opencart.testBase.TestBase;
import com.opencart.utilities.UtilClass;

public class LoginPageTest extends TestBase {
	
	@Test
	public void verifyLoginTest()
	{
		String expected_output = "My Account";
		
		HomePage home_obj = new HomePage(driver);
		LoginPage login_obj = new LoginPage(driver);
		UtilClass util_obj = new UtilClass();
		home_obj.clickOnMyAccountLink();
		home_obj.clickOnLoginLink();
		login_obj.enterEmailAddress("Davidabc4@gmail.com");
		login_obj.enterPassword("David@1234");
		login_obj.clickOnLogin();
		
		String actual_output = util_obj.getPageTitle();
		Assert.assertEquals(actual_output, expected_output);
	}

}
