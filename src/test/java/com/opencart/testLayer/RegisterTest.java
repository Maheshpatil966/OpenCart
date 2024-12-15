package com.opencart.testLayer;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pageLayer.HomePage;
import com.opencart.pageLayer.RegisterPage;
import com.opencart.testBase.TestBase;

public class RegisterTest extends TestBase {
	
	@Test
	public void verifyRegisterFunctionality()
	{
		String expected_result = "Your Account Has Been Created!";
		HomePage home_obj = new HomePage(driver);
		RegisterPage register_obj = new RegisterPage(driver);
		home_obj.clickOnMyAccountLink();
		home_obj.clickOnRegisterLink();
		
		register_obj.enterFirstname("David");
		register_obj.enterLastname("Warner");
		register_obj.enterEmail("Davidabc4@gmail.com");
		register_obj.enterTelephone("5126545");
		register_obj.enterPassword("David@1234");
		register_obj.enterConfirmPassword("David@1234");
		register_obj.clickOnPrivacyPolicyBox();
		register_obj.clickOnContinueButton();
		
		String actual_result = register_obj.getSuccessMessage();
		Assert.assertEquals(actual_result, expected_result);
	}

}
