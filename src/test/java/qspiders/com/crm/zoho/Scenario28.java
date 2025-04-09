package qspiders.com.crm.zoho;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario28
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin", Keys.TAB, "admin123", Keys.ENTER);
		Thread.sleep(2000);
		
		String expectedTitle = "OrangeHRM";
		String actualTitle = driver.getTitle();
		
		Thread.sleep(2000);
				
			if(actualTitle.contains(expectedTitle))
			{
				System.out.println("Dashboard page is Displayed");
				System.out.println("Hence Validation Successfull");
			}
			else
			{				
				System.out.println("Dashboard page is NOT Displayed");
				System.out.println("Hence Validation Successfull");
			}
				
		driver.close();
	}
}
