package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Browser.browser;

public class JobSearchPage extends browser {

	
	@FindBy(xpath = "//*[@id=\"qsb-keyword-sugg\"]")
	WebElement skill;
	@FindBy(xpath = "//*[@id=\"qsb-location-sugg\"]")
	WebElement locations;
	@FindBy(xpath = "//*[@id=\"root\"]/div[4]/div[1]/section/div/form/div[3]/button")
	WebElement searchh;

	public JobSearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Entering the Skills 
	public void skillsearch() {
		this.skill.sendKeys("Software Developer Trainee");

	}

	//Entering the location 
	public void jobloc() {

		this.locations.sendKeys("Bangalore");
	}

	
	public void search() {
		this.searchh.click();
	}
	
}
