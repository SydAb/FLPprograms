package com.selprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Statictables {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-table");
		
		String str = "Burj Khalifa";
		
		WebElement clkhotel =  driver.findElement(By.xpath("//*[text()='"+str+"']//following-sibling::td[2]"));

         String cty = clkhotel.getText();
       
        System.out.println(cty);       
       
       
       
       
       
       
       
    
	}

}
