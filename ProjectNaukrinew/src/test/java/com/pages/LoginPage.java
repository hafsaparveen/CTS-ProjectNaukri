package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Browser.browser;

public class LoginPage extends browser {
	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"login_Layer\"]")
	WebElement login;
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/form/div[2]/input")
	WebElement Email;
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/form/div[3]/input")
	WebElement pass;
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/form/div[5]/button")
	WebElement loginBtn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//To login the page
	public void loginfirst() {
		this.login.click();
	}

	//Providing valid email id
	public void values() {
		this.Email.sendKeys("hafsaparveen87@gmail.com");

	}

	//Giving the valid Password
	public void value() {
		this.pass.sendKeys("hafsapa88");
	}

	//To go to the homepage
	public void login() {
		this.loginBtn.click();

	}

}
