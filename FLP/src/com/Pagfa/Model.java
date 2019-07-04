package com.Pagfa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Model extends Login{

	public static void main(String[] args) {

     WebDriver driver = null;
		
     System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	 driver = new ChromeDriver();
	
	 driver.get("https://connect.maveric-systems.com/index.php/site/login");	
	 
	 Login pag = PageFactory.initElements(driver, Login.class);

     pag.username("syeda");
		
     pag.password("dsfga");
		
		
	}

}
