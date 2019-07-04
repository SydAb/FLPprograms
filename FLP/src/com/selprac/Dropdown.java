package com.selprac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		
		  WebDriver driver = null;
		
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
		  String Url = "https://www.facebook.com";
		   
		 
		  
	       System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	       
	       driver = new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       
	       driver.get(Url);
		 
	      
	       
	       Select drop = new Select(driver.findElement(By.id("month")));
		
	       drop.selectByIndex(1);
	       Thread.sleep(2000);
	       drop.selectByValue("2");
	       Thread.sleep(2000);
	       drop.selectByVisibleText("Mar");  
		 
		
		
		

	}

}
