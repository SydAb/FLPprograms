package com.selprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		
	 WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://maveric-systems.com");
		
		String Title = driver.getTitle();
		
		System.out.println("the title is:"+ Title);
		
		Thread.sleep(5000);
		
		
		//driver.findElement(By.linkText("")).click();
		
		
			
		//driver.navigate().back();
		
		driver.close();
		
		
		
		
		
		
		
	}

}
