package com.selprac;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindHandle {

	public static void main(String[] args) {
WebDriver driver = null;
		
		String URL = "https://www.toolsqa.com/automation-practice-switch-windows/";
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	    driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get(URL);
	   
	  

	   WebElement ele = driver.findElement(By.xpath("//button[@id='button1']"));
	   
	   ele.click();
	   
	   
	   String currentwindow = driver.getWindowHandle();
	   
	   System.out.println(currentwindow);
	   
	   Set<String> s = driver.getWindowHandles();
	   
	   java.util.Iterator<String> I = s.iterator();
	   
	   while(I.hasNext())
	   {
		   
		   String child = I.next();
		   if(!currentwindow.equalsIgnoreCase(child))
		   {
			   driver.switchTo().window(child);
			   driver.manage().window().maximize();
			   driver.findElement(By.xpath("//*[@id='primary-menu']/li[1]/a")).click();
			   driver.close();
			   
		   }
		   
		   
	   }

		   driver.switchTo().window(currentwindow);
		   driver.findElement(By.id("alert")).click();
		   Alert al = driver.switchTo().alert();
		   al.accept();
	
		};
	   }
	   
	


