package qspiders.com.crm.zoho;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario42
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		WebElement mouseAction = driver.findElement(By.xpath("//section[text()='Mouse Actions']"));
		act.scrollToElement(mouseAction).perform();
		Thread.sleep(2000);
		mouseAction.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Drag Multiple']")).click();
		Thread.sleep(2000);
		
		WebElement laptopCharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement mobileCover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement laptopCover = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		WebElement mobileCharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement mobileAccessories = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement laptopAccessories = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		
		Robot r = new Robot();
		
		act.click(laptopCharger).perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_SHIFT);
		act.click(laptopCover).perform();
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_SHIFT);
		act.dragAndDrop(laptopCharger, laptopAccessories).perform();
		Thread.sleep(2000);		
		act.dragAndDrop(laptopCover, laptopAccessories).perform();
		Thread.sleep(2000);
		
		act.click(mobileCover).perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_SHIFT);
		act.click(mobileCharger).perform();
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_SHIFT);
		act.dragAndDrop(mobileCover, mobileAccessories).perform();
		Thread.sleep(2000);
		act.dragAndDrop(mobileCharger, mobileAccessories).perform();
		Thread.sleep(2000);
		
		driver.close();	
		
	}
}	
