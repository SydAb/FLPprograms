package com.Pagfa;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

	@FindBy(id="LoginForm_username")
	
	 WebElement username;
	
	@FindBy(id="LoginForm_password")
	
	WebElement password;
	

	public void username(String string) {
	
		username.sendKeys(string);
	}

	public void password(String string) {
		
		password.sendKeys(string);
	}
	
}
