package com.tripadvisor.pages;
//pom class_2 click on write a review

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ClubMahindraMadikeriCoorgPage {
	
	@FindBy(xpath="//a[.='Write a review']")
	private WebElement clickonbutton;
	
	public ClubMahindraMadikeriCoorgPage(WebDriver driver)
	{
    PageFactory.initElements(driver, this);
	}
	
	public void clickonreview()
	{
	clickonbutton.click();
	}
}
