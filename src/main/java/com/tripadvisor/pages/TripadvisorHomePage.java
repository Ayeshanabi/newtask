package com.tripadvisor.pages;
//pom class_1 click on search box and search for the place.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TripadvisorHomePage {
	
	@FindBy(className="_3qLQ-U8m")
	private WebElement Searchpage;

	@FindBy(className="_2oYoDbfY")
	private WebElement mainsearch;

	public TripadvisorHomePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}

	public void clickonsearchtab() throws InterruptedException
	{
	Searchpage.click();
	Thread.sleep(4000);
	Searchpage.sendKeys("Club Mahindra Madikeri Coorg");
	}

	public void enterText()
	{
	mainsearch.click();
	}
}
	
