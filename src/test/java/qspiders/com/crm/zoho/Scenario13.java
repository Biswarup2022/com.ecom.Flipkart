package qspiders.com.crm.zoho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario13
{
   public static void main(String[] args) throws InterruptedException
   {
	   	WebDriver driver = new ChromeDriver();
	   	driver.manage().window().maximize();
	   	Thread.sleep(2000);
	   	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   	Thread.sleep(2000);
	   	WebElement usernameTextField = driver.findElement(By.cssSelector("input[placeholder='Username']"));
	   	usernameTextField.sendKeys("Admin");
	   	Thread.sleep(2000);
	   	WebElement pwdTextField = driver.findElement(By.cssSelector("input[placeholder='Password']"));
	   	pwdTextField.sendKeys("admin123");
	   	Thread.sleep(2000);
	   	WebElement loginIcon = driver.findElement(By.cssSelector("button[type='submit']"));
	   	loginIcon.click();
	   	Thread.sleep(2000);
	   	
	   	String expectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	   	String actualURL = driver.getCurrentUrl();
	   	
	   	if(actualURL.contains(expectedURL))
	   	{
	   		System.out.println("Validation Succesfull");
	   		Thread.sleep(2000);
	   	}
	   	else
	   		System.out.println("Validation Failure");
	   	
	   	driver.close();
	   	
	   	
   }
}
