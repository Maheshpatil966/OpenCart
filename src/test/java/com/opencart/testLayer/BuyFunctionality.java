package com.opencart.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pageLayer.Checkout;
import com.opencart.pageLayer.HomePage;
import com.opencart.pageLayer.LoginPage;
import com.opencart.pageLayer.ProductPage;
import com.opencart.pageLayer.ShoppingCartPage;
import com.opencart.testBase.TestBase;
import com.opencart.utilities.UtilClass;

public class BuyFunctionality extends TestBase {
	
	@Test
	public void verifyBuyProduct() throws InterruptedException
	{
		String expected_output = "Your order has been placed!";
		HomePage home_obj = new HomePage(driver);
		ProductPage product_obj = new ProductPage(driver);
		ShoppingCartPage cart_obj = new ShoppingCartPage(driver);
		LoginPage login_obj = new LoginPage(driver);
		Checkout checkout_obj = new Checkout(driver);
		UtilClass util_obj = new UtilClass();

		home_obj.enterProductInSearchBox("iMac");
		product_obj.clickOnProduct();
		product_obj.clickOnAddToCart();
		Thread.sleep(2000);
		logger.info("Product added to cart");
		cart_obj.clickOnShoppingCartLink();
		cart_obj.clickOnCheckOutButton();
		Thread.sleep(2000);
		logger.info("Product is on checkout");
		login_obj.enterEmailAddress("Davidabc4@gmail.com");
		login_obj.enterPassword("David@1234");
		login_obj.clickOnLogin();
		Thread.sleep(2000);
		logger.info("Logged in");
		checkout_obj.clickOnContinueBillingDetails();
		checkout_obj.clickOnContinueDeliveryDetails();
		checkout_obj.clickOnContinueDeliveryMethod();
		checkout_obj.clickOnContinuePaymentMethod();
		checkout_obj.clickOnConfirmOrderButton();
		logger.info("Order Confirmed");
		Thread.sleep(2000);
		Assert.assertEquals(util_obj.getPageTitle(), expected_output);
	}
	

}
