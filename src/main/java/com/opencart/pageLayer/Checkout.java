package com.opencart.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Checkout {

	private WebDriver driver;
	public Checkout(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//----------------- Obj repo ----------------
	
	private By firstname_txtbox = By.xpath("//input[@id='input-payment-firstname']");
	private By lastname_txtbox = By.xpath("//input[@id='input-payment-lastname']");
	private By company_txtbox = By.xpath("//input[@id='input-payment-company']");
	private By address1_txtbox = By.xpath("//input[@id='input-payment-address-1']");
	private By address2_txtbox = By.xpath("//input[@id='input-payment-address-2']");
	private By city_txtbox = By.xpath("//input[@id='input-payment-city']");
	private By postcode_txtbox = By.xpath("//input[@id='input-payment-postcode']");
	private By country = By.xpath("//select[@id='input-payment-country']");
	private By state = By.xpath("//select[@id='input-payment-zone']");
	
	
	
	private By continue_billing_details_btn = By.xpath("//input[@id='button-payment-address']");
	private By continue_delivery_details_btn = By.xpath("//input[@id='button-shipping-address']");
	private By continue_delivery_method_btn = By.xpath("//input[@id='button-shipping-method']");
	private By term_conditions_checkbox	 = By.xpath("//input[@name='agree']");
	private By continue_payment_method_btn = By.xpath("//input[@id='button-payment-method']");
	
	private By confirm_order_btn = By.xpath("//input[@id='button-confirm']");
	//---------- Action methods -------------
	public void enterBillingDetails()
	{
		driver.findElement(firstname_txtbox).sendKeys("David");
		driver.findElement(lastname_txtbox).sendKeys("Warner");
		driver.findElement(company_txtbox).sendKeys("Wipro");
		driver.findElement(address1_txtbox).sendKeys("Pimpri");
		driver.findElement(address2_txtbox).sendKeys("Chinchwad");
		driver.findElement(city_txtbox).sendKeys("Pune");
		driver.findElement(postcode_txtbox).sendKeys("411011");
		selectCountry(driver.findElement(country),"India");
		selectCountry(driver.findElement(state),"Maharashtra");
		driver.findElement(continue_billing_details_btn).click();
	}
	
	public static void selectCountry(WebElement web_elementref,String text)
	{
		Select s = new Select(web_elementref);
		s.selectByVisibleText(text);
	}
	
	public void clickOnContinueBillingDetails()
	{
		driver.findElement(continue_billing_details_btn).click();
	}

	public void clickOnContinueDeliveryDetails()
	{
		driver.findElement(continue_delivery_details_btn).click();
	}
	
	public void clickOnContinueDeliveryMethod()
	{
		driver.findElement(continue_delivery_method_btn).click();
	}
	
	public void clickOnContinuePaymentMethod()
	{
		driver.findElement(term_conditions_checkbox).click();
		driver.findElement(continue_payment_method_btn).click();
	}
	
	public void clickOnConfirmOrderButton()
	{
		driver.findElement(confirm_order_btn).click();
	}
	
}
