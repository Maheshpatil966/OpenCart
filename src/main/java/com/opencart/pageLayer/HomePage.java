package com.opencart.pageLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//----------------- Obj repo ----------------
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	private WebElement my_account_link;
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	private WebElement register_link;
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	private WebElement login_link;
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement search_txtbox;
	
	//--------------- action methods --------------
	public void clickOnMyAccountLink()
	{
		my_account_link.click();
	}
	
	public void clickOnRegisterLink()
	{
		register_link.click();
	}
	public void clickOnLoginLink()
	{
		login_link.click();
	}
	
	public void enterProductInSearchBox(String product_name)
	{
		search_txtbox.sendKeys(product_name+Keys.ENTER);
	}
	
	
	
	
	
}
