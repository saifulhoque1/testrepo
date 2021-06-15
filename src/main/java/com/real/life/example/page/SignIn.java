package com.real.life.example.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {
	
	public WebDriver dr;
	
	public void selectSigninTab () {
		dr.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		
	}
	
	public void signInCredential ( String useremail, String password) {
		WebElement signIn= dr.findElement(By.xpath("//input[@id='ap_email']"));
		signIn.click();
		signIn.sendKeys(useremail);
		dr.findElement(By.xpath("//input[@id='continue']")).click();
		WebElement userPassword=dr.findElement(By.xpath("//input[@id='ap_password']"));
		userPassword.click();
		userPassword.sendKeys(password);
		dr.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	}

}
