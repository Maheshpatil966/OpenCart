package com.opencart.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

	private WebDriver driver;
	public ShoppingCartPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//----------------- Obj repo ----------------
	@FindBy(xpath="//span[contains(text(),'Shopping Cart')]")
	private WebElement shopping_cart_link;
	
	private By checkout_btn = By.xpath("//a[contains(text(),'Checkout')]");
	
	//---------- Action methods -------------
	public void clickOnShoppingCartLink()
	{
		shopping_cart_link.click();
	}
	
	public void clickOnCheckOutButton()
	{
		driver.findElement(checkout_btn).click();
	}
	
}
