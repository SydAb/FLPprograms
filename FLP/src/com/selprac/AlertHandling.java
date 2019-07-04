package com.selprac;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandling {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/pageUnderConstruction.jsf");
		
		//driver.manage().window().setSize(350*250);
		
		
		WebElement login = driver.findElement(By.xpath("//*[@id='loginbutton' and @value='Login']"));
		
		login.click();
		
		Alert al = driver.switchTo().alert();
		
		al.accept();
		
		//System.out.println(al.getText());
		
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		
		//wait.until(ExpectedConditions.alertIsPresent())
		
		
		
		
		
		
		
		

	}

}
