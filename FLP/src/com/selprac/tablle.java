package com.selprac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablle {

	    public static void main(String[] args) {
	  	
         System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-table");
		
		WebElement table = driver.findElement(By.className("tsc_table_s13"));
		
		List<WebElement> rows = table.findElements(By.tagName("th"));
		
		/*for(int i = 0;i<rows.size();i++)
		{
			System.out.println(rows.get(i).getText());
		}*/
				
	 
		for(int i=0;i<rows.size();i++)
		{
			System.out.print(rows.get(i).getText()+"  ");
			List<WebElement> col = driver.findElements(By.tagName("td"));
			for(int j=0;j<rows.size()-1;j++)
			{
				System.out.print(col.get(j).getText()+" ");
			}
			
		}
	   
		}
		
		
	}


