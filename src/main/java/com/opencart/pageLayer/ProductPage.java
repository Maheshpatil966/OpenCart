package com.opencart.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	private WebDriver driver;
	public ProductPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//----------------- Obj repo ----------------
	@FindBy(xpath="//div[@class='image']")
	private WebElement product_link;
	
	@FindBy(xpath="//button[@id='button-cart']")
	private WebElement add_to_cart_btn;
	
	//--------------- Action method ------------
	public void clickOnProduct()
	{
		product_link.click();
	}
	public void clickOnAddToCart()
	{
		add_to_cart_btn.click();
	}
	
	
	
}
