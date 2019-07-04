package com.selprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	public static void main(String[] args) {
	
		WebDriver driver = null;
		
		String Url = "https://www.irctc.co.in/nget/train-search";
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(Url);
		
		driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[1]/div[3]/a/i")).click();
		
		driver.findElement(By.xpath("//*[@id=\"slide-menu\"]/p-sidebar/div/nav/div/label/button")).click();
		
		driver.findElement(By.xpath("//*[@formcontrolname = 'userid' and @id='userId']")).sendKeys("Syed");
		
		
		driver.findElement(By.xpath("//*[@formcontrolname = 'password' and @id='pwd']")).sendKeys("gsfa");
		
		driver.findElement(By.xpath("//*[@id=\"login_header_disable\"]/div/div[2]/div[2]/div/div[2]/div[3]/div[2]/form/button")).click();
		
		//String text = driver.findElement(By.linkText("Please Enter Valid Captcha")).getText();
		
		
		
		//System.out.println("THe text forentering captcha:"+text);
		
		
		
		

	}

}
