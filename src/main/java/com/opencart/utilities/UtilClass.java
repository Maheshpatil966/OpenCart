package com.opencart.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.opencart.testBase.TestBase;

public class UtilClass extends TestBase {
	
	public UtilClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle()
	{
		String title = driver.getTitle();
		return title;
	}
	
	public static void takeSS(String filename)
	{
		String path = "E:\\ecips\\OpenCartApplication\\screenshots\\";
		try 
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			File des = new File(path+filename+".png");
			FileHandler.copy(src, des);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	
	
}
