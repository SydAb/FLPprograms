package com.selprac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facetest {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		WebDriver driver = null;
		
		String Url = "https://www.facebook.com";
		
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get(Url);
		
		String text = driver.findElement(By.xpath("//input[@name='firstname ']//preceding-sibling::div")).getText();
		
		System.out.println(text);
		
		
		
		

	}

}
