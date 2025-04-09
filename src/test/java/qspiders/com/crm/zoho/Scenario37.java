package qspiders.com.crm.zoho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario37
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Drag Position")).click();
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		WebElement mobileCharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement mobileAccessories = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement laptopCharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement laptopAccessories = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		WebElement mobileCover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement laptopCover = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
		act.dragAndDrop(mobileCharger, mobileAccessories).perform();
		Thread.sleep(2000);
		
		act.dragAndDrop(mobileCover, mobileAccessories).perform();
		Thread.sleep(2000);
		
		act.dragAndDrop(laptopCharger, laptopAccessories).perform();
		Thread.sleep(2000);
		
		act.dragAndDrop(laptopCover, laptopAccessories).perform();
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
