package qspiders.com.crm.zoho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario38
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.className("Pke_EE")).sendKeys("iphone 16");
		Thread.sleep(2000);
		
		driver.findElement(By.className("_2iLD__")).click();
		Thread.sleep(2000);
		
		WebElement leftPointer = driver.findElement(By.xpath("//div[@class='iToJ4v Kaqq1s']"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(leftPointer, 50, 0).perform();
		Thread.sleep(2000);
		
		WebElement rightPointer = driver.findElement(By.xpath("//div[@class='iToJ4v D0puJn']"));
		act.dragAndDropBy(rightPointer, -50, 0);
		Thread.sleep(2000);
		driver.close();
	}
}
