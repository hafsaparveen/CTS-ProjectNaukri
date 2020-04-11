package com.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Browser.browser;

public class RecuitersPage extends browser {

		
		@FindBy(xpath="//*[@id=\"root\"]/div[1]/div/ul[1]/li[2]/a")   
		WebElement recuiters; 
		@FindBy(xpath="//*[@id=\"browse\"]/li[2]/a")
		WebElement category;
		@FindBy(xpath="//*[@id=\"BestPlaces\"]/ul/li[2]")
		WebElement recuiterrr;
		
		public RecuitersPage (WebDriver driver) 
		{        
			PageFactory.initElements(driver,this);     
		}

		public void recute() 
		{
			this.recuiters.click();		
		}
		
			public void bycategory()
		{
			this.category.click();			
		}
		
		public void recuiter() 
		{
			Actions action=new Actions(driver);
			action.moveToElement(recuiters).build().perform();
			this.recuiterrr.click();
		}
		
	}

