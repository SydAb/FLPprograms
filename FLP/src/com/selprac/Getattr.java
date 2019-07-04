package com.selprac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattr {

	public static void main(String[] args) {

      System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		
		
		WebElement Elemnt = driver.findElement(By.id("LoginForm_username"));
			
		Elemnt.sendKeys("syeda");
			
		WebElement Elmnt = driver.findElement(By.id("LoginForm_password"));
			
			Elmnt.sendKeys("***");

		  
		  WebElement signin = driver.findElement(By.name("yt0"));
		  
		  String  logn = signin.getAttribute("value");
				
		  System.out.println(logn);
	
		  String Expected = driver.findElement(By.linkText("Welcome (Syed Abrar Ahmed Ziayur Rahaman)")).getText();
		  
		  String Actual = "Welcome (Syed Abrar Ahmed Ziayur Rahaman)";
		  
		  

	}

}
