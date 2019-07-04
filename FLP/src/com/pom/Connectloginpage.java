package com.pom;


import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Connectloginpage {

	
	public static WebElement Username(WebDriver driver)
	{
		WebElement Elemnt = driver.findElement(By.id("LoginForm_username"));
		return Elemnt;	
	}
	
	public static WebElement password(WebDriver driver)
	{
		WebElement Elemnt = driver.findElement(By.id("LoginForm_password"));
		return Elemnt;
		
	}
	
	
	public static WebElement signin(WebDriver driver)
	{
		 WebElement signin = driver.findElement(By.name("yt0"));
		 return signin;
	}
	
	
	public static WebElement errormessage(WebDriver driver)
	{
		WebElement Ele = driver.findElement(By.xpath("//div[@class='errorMessage' and @id='LoginForm_password_em_']"));
		return Ele;
		
	}
	
	
	


}
