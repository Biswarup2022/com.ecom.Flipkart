package qspiders.com.crm.zoho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario23
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).submit();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[text()='Username']/../following-sibling::div/input")).sendKeys("Admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("JF Salma");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(2000);
		
		driver.close();
	}
}
