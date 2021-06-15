package com.real.life.example.pageTest;

import org.testng.annotations.Test;

import com.real.life.example.page.SignIn;

public class SignInTest {
	
	SignIn objSignIn = new SignIn();
	@Test
	public void cickOnSignInTab() {
		objSignIn.selectSigninTab();
	}
	
	@Test
	public void inputSignInCredential() {
		objSignIn.signInCredential("abc@gmail.com", "Dhaka123");
	}
	

}
