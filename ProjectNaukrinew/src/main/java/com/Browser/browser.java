package com.Browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browser  {
	 protected static WebDriver driver;
	public WebDriver Browsersetup(String browserName)
	{
		if(browserName.equals("Chrome"))
		{
			
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		     driver = new ChromeDriver(); 	
		     driver.manage().window().maximize();  
		     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		}
		else if(browserName.equals("Firefox"))
		{ 
			System.setProperty("webdriver.gecko.driver","C:\\selenium drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	     driver = new FirefoxDriver();
	     driver.manage().window().maximize();  
	     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
			
		}
		driver.get("https://www.naukri.com");
	  
	     
	     return driver;
	
	}

}