package com.opencart.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//----------------- Obj repo ----------------
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement email_address_textbox;
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement password_txtbox;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement login_btn;
	
	//-------------- Action methods ---------------
	public void enterEmailAddress(String email)
	{
		email_address_textbox.sendKeys(email);
	}
	public void enterPassword(String password)
	{
		password_txtbox.sendKeys(password);
	}
	
	public void clickOnLogin()
	{
		login_btn.click();
	}
	
}
