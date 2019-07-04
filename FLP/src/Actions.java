import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class Actions {

	


	public static void main(String[] args) throws InterruptedException {
		
		 Dimension d = new Dimension(8000,4000);
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().setSize(d);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		
		WebElement Elemnt = driver.findElement(By.id("LoginForm_username"));
		
		Elemnt.sendKeys("syeda");
		
		WebElement Elmnt = driver.findElement(By.id("LoginForm_password"));
		
		Elmnt.sendKeys("");
		
		 WebElement signin = driver.findElement(By.name("yt0"));		 

		 signin.click();
		 
		 
		 org.openqa.selenium.interactions.Actions builder = new org.openqa.selenium.interactions.Actions(driver);
		 
		 WebElement time = driver.findElement(By.linkText("Timecard"));
		
		builder.moveToElement(time).build().perform();
		
		
		WebElement Mytime = driver.findElement(By.linkText("Add Timecard"));
		 
		 Mytime.click();
		
		 WebElement sub = driver.findElement(By.id("submitweekly"));
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		 js.executeScript("arguments[0].scrollIntoView(true);",sub);
		 
		 driver.findElement(By.id("submitweekly")).click();
		
		
		
		
		
		
		
		
		
		
		
	}
}
