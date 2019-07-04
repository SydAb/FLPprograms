package com.selprac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffxp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   WebDriver driver = null;
		   
		   String Url = "http://register.rediff.com/register/register.php?FormName=user_details";
		   
	       System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	       
	       driver = new ChromeDriver();
	       
	       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	       
	       driver.manage().window().maximize();
	       
	       driver.get(Url);
		
		   WebElement ele =  driver.findElement(By.xpath("//input[contains(@name,'name')]"));
		   
		   ele.sendKeys("syed");
		   
		   WebElement pwd = driver.findElement(By.xpath("//input[starts-with(@name,'confirm_passwd')]"));
		   
		   pwd.sendKeys("gfjk");
		
		 //  WebElement crt = driver.findElement(By.xpath("//input[ends-with(@value,' my account')]"));
		   
		//   crt.click();
		
		   WebElement pwd0 = driver.findElement(By.xpath("//input[@type = 'password' and contains(@name,'passwd')]"));
		
		   pwd0.sendKeys("1234");
		   
		
		
		

	}

}
