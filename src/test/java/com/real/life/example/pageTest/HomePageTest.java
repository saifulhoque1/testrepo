package com.real.life.example.pageTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.real.life.example.page.HomePage;

public class HomePageTest {
	
	WebDriver dr;

	HomePage objHomePage = new HomePage(dr);
	
	@BeforeTest
	public void openBrowser() {

		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe\\");
			dr = new ChromeDriver();
			dr.get("https://www.amazon.com");
			Reporter.log("Chrome Browser Launched Successfully");

		} catch (Exception e) {
			Assert.fail("Chrome Browser Failed To Launch");
		}

	}

	@AfterTest
	public void closeBrowser() throws InterruptedException {

		Thread.sleep(10000);
		dr.quit();

	}

	

	@Test
	public void verifyUrlTest() throws InterruptedException {
	
		objHomePage.verifyURL();
		
	}

	@Test
	public void verifyTitleTest() throws InterruptedException {
		
		objHomePage.verifyTitle();
	
	}

}
