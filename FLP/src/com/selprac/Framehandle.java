package com.selprac;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framehandle {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		
		String URL = "http://hugelearning.com/iframe-practice-page/";
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	    driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get(URL);
	    
	    String win = driver.getWindowHandle();
		
	    System.out.println(win);
	    
	    WebElement frame11 = driver.findElement(By.tagName("iframe"));
	    
	    driver.switchTo().frame(frame11);
	    
		WebElement name = driver.findElement(By.name("First_Name"));
		
		name.sendKeys("sdsff");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//*[@class='mega-menu-link' and @href='http://hugelearning.com/']")).click();
		
		String hom = driver.getWindowHandle();
		
		System.out.println(hom);
		
		
		
		
		
	}

}
