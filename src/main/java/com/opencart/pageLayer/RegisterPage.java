package com.opencart.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	private WebDriver driver;
	public RegisterPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//----------------- Obj repo ----------------
	@FindBy(xpath="//input[@id='input-firstname']")
	private WebElement firstname_txtbox;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	private WebElement lastname_txtbox;
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement email_txtbox;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	private WebElement telephone_txtbox;
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement password_txtbox;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	private WebElement confirm_password_txtbox;
	
	@FindBy(xpath="//input[@name='agree']")
	private WebElement privacy_policy_checkbox;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continue_btn;
	
	@FindBy(xpath="//div[@id='content']/h1")
	private WebElement success_msg;
	
	
	//--------------- action methods --------------
	public void enterFirstname(String firstname)
	{
		firstname_txtbox.sendKeys(firstname);
	}
	
	public void enterLastname(String lastname)
	{
		lastname_txtbox.sendKeys(lastname);
	}
	public void enterEmail(String mail)
	{
		email_txtbox.sendKeys(mail);
	}
	public void enterTelephone(String telephone)
	{
		telephone_txtbox.sendKeys(telephone);
	}
	public void enterPassword(String password)
	{
		password_txtbox.sendKeys(password);
	}
	public void enterConfirmPassword(String cpassword)
	{
		confirm_password_txtbox.sendKeys(cpassword);
	}
	public void clickOnPrivacyPolicyBox()
	{
		privacy_policy_checkbox.click();
	}
	public void clickOnContinueButton()
	{
		continue_btn.click();
	}
	
	public String getSuccessMessage()
	{
		String text =success_msg.getText();
		return text;
	}
	
	
}
