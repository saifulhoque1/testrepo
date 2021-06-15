package com.real.life.example.page;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;


public class HomePage {
	

	public WebDriver dr;


	public HomePage(WebDriver dr) {
		
		this.dr=dr;

	}
	
	public void verifyURL() {
		
		String expectedUrl = "https://www.amazon.com/";
		
		try {
			Assert.assertEquals(dr.getCurrentUrl(), expectedUrl);
			Reporter.log("URL is as expected");
		} catch (Exception e) {
			Assert.fail("URL doesn't match with the expected");
		}

	}

	public void verifyTitle() {
		String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		try {
			Assert.assertEquals(dr.getTitle(), expectedTitle);
			Reporter.log("Title is as expected");
		} catch (Exception e) {
			Assert.fail("Title doesn't match with the expected");
		}

	}

}
