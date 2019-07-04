package com.selprac;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class scrnshot {

	
	public static String now() {
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMHmmss");
		return sdf.format(cal.getTime());
		
	}
	
	public static void scrnshot(WebDriver driver) throws IOException {
		
        TakesScreenshot scrnshot = ((TakesScreenshot)driver); 
		
		File scrnfile = scrnshot.getScreenshotAs(OutputType.FILE);
		
		File Destfile = new File("./Screenshots/"+now()+".png");
		
		org.openqa.selenium.io.FileHandler.copy(scrnfile, Destfile);
	}
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		
		driver.findElement(By.id("LoginForm_username")).sendKeys("aaaa");
		
		driver.findElement(By.name("yt0")).click();
		
		scrnshot(driver);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
