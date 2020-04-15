package com.tripadvisor.tests;
//Logging in to the tripadvisor and giving reviews.
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.tripadvisor.generic.windowhandle;
import com.tripadvisor.pages.ClubMahindraMadikeriCoorgPage;
import com.tripadvisor.pages.TripadvisorHomePage;
import com.tripadvisor.pages.WriteAReviewPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TripadvisorTest {

	public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.tripadvisor.in/");
    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    {
	TripadvisorHomePage t=new TripadvisorHomePage(driver);
    t.clickonsearchtab();
	Thread.sleep(2000);
	t.enterText();
	
	ClubMahindraMadikeriCoorgPage t1 = new ClubMahindraMadikeriCoorgPage(driver);
	t1.clickonreview();
	windowhandle.switchWindow(driver, " Write a review - TripAdvisor ");
 
	WriteAReviewPage t2= new WriteAReviewPage(driver);
	t2.review();
	t2.review1();
	}
	driver.quit();
	}
	}

