package com.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Browser.browser;


	
public class CompanyGovtPage extends browser {


			@FindBy(linkText = "Jobs Posted By Top Companies")
			WebElement company;
			@FindBy(xpath="//*[@id=\"root\"]/div[1]/div/ul[1]/li[3]/a")   
			WebElement companypage; 

			@FindBy(xpath="/html/body/div[3]/div[2]/div/ul/li[3]/a") 
			WebElement govt;
			@FindBy(xpath="//*[@id=\"42\"]")
			WebElement defgovt;
			@FindBy(xpath="//*[@id=\"tabJ-2\"]/ul/li[1]/a/img")
			WebElement army;
			
			public CompanyGovtPage (WebDriver driver) {        
				PageFactory.initElements(driver,this);     
			}

			public void cpage() 
			{
				companypage.click();
				
			}
			public void government()
			{
			    govt.click();	
			}
			
			public void defencegovt()
			{
			   defgovt.click();
			}
			public void indianarmy() {
				army.click();
			}
												
		}

	
	