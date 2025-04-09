package qspiders.com.crm.zoho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario27
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		Thread.sleep(4000);
		
		driver.manage().window().minimize();
		
		WebElement nameTextField = driver.findElement(By.id("name"));
		if(nameTextField.isEnabled())
		{
			System.out.println("Name TextField is Active");
		}
		else {
			System.out.println("Name TextField is NOT Active");
			System.out.println("Hence Validation Successfull");
			}
		Thread.sleep(1000);
		
		WebElement emailTextField = driver.findElement(By.id("email"));
		if(emailTextField.isEnabled())
		{
			System.out.println("Name TextField is Active");			
		}
		else {
			System.out.println("Email TextField is NOT Active");
			System.out.println("Hence Validation Successfull");			
			}
		Thread.sleep(1000);
			
		WebElement pwdTextField = driver.findElement(By.id("password"));
		if(pwdTextField.isEnabled())
		{
			System.out.println("Name TextField is Active");						
		}
		else {
			System.out.println("Password TextField is NOT Active");
			System.out.println("Hence Validation Successfull");						
			}
		Thread.sleep(1000);
			
		driver.close();
		
	}
}
