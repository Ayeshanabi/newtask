package com.tripadvisor.pages;
//pom class_3 giving review.

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WriteAReviewPage {
	
	@FindBy(className="ui_bubble_rating")
	private WebElement ratting;
	
	@FindBy(xpath="//input[@id='ReviewTitle']")
	private WebElement title;
	
	@FindBy(xpath="//textarea[@id='ReviewText']")
	private WebElement text;
	
	@FindBy(xpath="//select[@id='trip_date_month_year']")
	private WebElement ddmmyy;
	
	@FindBy(xpath="//div[.='Family']")
	private WebElement trip;
	
	@FindBy(id="noFraud")
	private WebElement checkbox;
	
	@FindBy(id="SUBMIT")
	private WebElement submit;	
	
	public WriteAReviewPage(WebDriver driver)
	{
	    PageFactory.initElements(driver, this);
	}
	
	public void review() throws InterruptedException
	{
		ratting.getAttribute("class");
		Thread.sleep(2000);
		ratting.click();
	    title.sendKeys("Good Place"); 
	    text.sendKeys("Club Mahindra at Madikeri ,Kodagu(Coorg) is one of the best properties I have visited-Friendly and Efficient Staff, Anousha and the team were outstanding . This was the first time we drove from Bangalore via Nelamangala,Holenarsipur and Kushalnagar to Madikeri, a pleasant drive with roads varying from excellent to 'just okay'.The traffic congestion is far,far less than the Bangalore -Mysore Road.If it is a break one is looking for ,the ideal choice in Club Mahindra ,Madikeri -a total destress");
	    trip.click();
	}
	
    public void review1() 
    {
	    Select sel=new Select(ddmmyy);
	    sel.selectByVisibleText("January 2020");
	    checkbox.click();
	    submit.click();
	}	
}
	


