package com.selprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSexec {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		
		driver.findElement(By.id("LoginForm_username")).sendKeys("syeda");
		
		WebElement Elemnt = driver.findElement(By.id("LoginForm_password"));
		
		Elemnt.sendKeys("Syed@9962");
		
		WebElement signin = driver.findElement(By.name("yt0"));		 

		 signin.click();
		 
		 
		 org.openqa.selenium.interactions.Actions builder = new org.openqa.selenium.interactions.Actions(driver);
		 
		 WebElement time = driver.findElement(By.linkText("Timecard"));
		
		 builder.moveToElement(time).build().perform();
		
		
		 WebElement Mytime = driver.findElement(By.linkText("Add Timecard"));
		 
		 Mytime.click();
		
	}

}
