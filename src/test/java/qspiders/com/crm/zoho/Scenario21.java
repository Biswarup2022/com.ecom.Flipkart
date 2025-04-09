package qspiders.com.crm.zoho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario21
{
		public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver = new ChromeDriver ();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			WebElement userNameTextField = driver.findElement(By.name("username"));
			userNameTextField.sendKeys("Admin");
			Thread.sleep(2000);
			
			WebElement pwdTextField = driver.findElement(By.name("password"));
			pwdTextField.sendKeys("admin123");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@type = 'submit']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//span[text()='Admin']")).click();
			Thread.sleep(2000);
			driver.manage().window().minimize();
			Thread.sleep(2000);
			
			String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
			String actualUrl = driver.getCurrentUrl();
				if(actualUrl.contains(expectedUrl))
				{
					System.out.println("Admin Page is Displayed");
					System.out.println("Hence Validation Successfull");
				}
				else
					System.out.println("Validation Failure");
				
				Thread.sleep(4000);
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//i[contains(@class,'oxd-icon bi-caret-down-fill oxd-userdropdown-icon')]")).click();
				Thread.sleep(2000);
			
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				Thread.sleep(2000);
				
				driver.navigate().refresh();
				Thread.sleep(2000);
			
				driver.close();
		}
}
