package com.selprac;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {

	   WebDriver driver = null;
	   
	   //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	   String Url = "https://www.facebook.com";
	   
       System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
       
       driver = new ChromeDriver();
       
       driver.manage().window().maximize();
       
       driver.get(Url);
       
//       WebElement rdio = driver.findElement(By.xpath("//*[@name='sex' and @value='1']"));
       
  //     rdio.click();
       
       // List<WebElement> elem = driver.findElements(By.xpath("//input[@type='radio']"));
        
        //int radiossize = elem.size();
        
        //System.out.println(radiossize);
        
       // for (WebElement e : elem) {
       // 	e.click();
			
		//}

       
		

	}

}         
