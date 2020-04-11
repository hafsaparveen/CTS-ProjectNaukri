package com.pages;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.Browser.browser;


	public class ServicePage extends browser {

		
		@FindBy(xpath="//*[@id=\"login_Layer\"]/div")
		WebElement login;
		@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/form/div[2]/input")
		WebElement username;
		@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/form/div[3]/input")
		WebElement password;
		@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/form/div[5]/button")
		WebElement loginbtn;
		@FindBy(xpath="/html/body/div[1]/div/div/ul[2]/li[2]/a/div[2]")
		WebElement mynaukri;
		@FindBy(xpath="/html/body/div[1]/div/div/ul[2]/li[2]/div/ul[2]/li[4]/a")
		WebElement service; 
		
		
		public ServicePage() {
			PageFactory.initElements(driver,this);
		}
		public void servicepg() {
			Actions action = new Actions(driver);
			action.moveToElement(mynaukri).build().perform();
			this.service.click();
				
		}
		
		

	}

