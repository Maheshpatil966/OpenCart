package com.opencart.testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Logger logger;
	@BeforeTest
	public void start()
	{
		logger = Logger.getLogger("Opencart Framework");
		PropertyConfigurator.configure("Log4jfile.properties");		
		
		logger.info("Framework execution Started");
	}
	
	@AfterTest
	public void finish()
	{
		logger.info("Framework execution finished");
		logger.info("--------------------------------------------");
	}
	
	@BeforeMethod
	public void setUp()
	{
		String br = "edge";
		
		if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Please provide correct browser name");
		}
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		logger.info("browser launches , url, waits, maximize");
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		logger.info("browser closed");
	}
	
	
}
