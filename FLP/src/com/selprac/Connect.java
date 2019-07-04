package com.selprac;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pom.Connectloginpage;

public class Connect extends Connectloginpage{

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://connect.maveric-systems.com/index.php/site/login");

		Connectloginpage.Username(driver).sendKeys("Syeda");
		
		Connectloginpage.password(driver).sendKeys("Syed");
		
		Connectloginpage.signin(driver).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		WebElement txt = Connectloginpage.errormessage(driver);

		String text = txt.getText();
		
		System.out.println(text);
	      
		
		//check.click();
		
		/*if(check.isSelected())
		{
			System.out.println("Check box selected:"+check.isSelected());
		}
	     
		else {
			check.click();
			System.out.println("Check box selected:"+check.isSelected());
		}
	
		 Thread.sleep(3000);
		
		WebElement QMS = driver.findElement(By.xpath("//*[text()='QMS']"));
		
		QMS.click();*/
		
		
		
	}
	
}
