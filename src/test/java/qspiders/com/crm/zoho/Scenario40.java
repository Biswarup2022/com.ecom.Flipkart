package qspiders.com.crm.zoho;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario40
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
//		WebElement bangla = driver.findElement(By.linkText("বাংলা"));
//		act.scrollToElement(bangla).perform();
//		Thread.sleep(4000);
		
//		Robot r = new Robot();
//		for(int i =0; i<3; i++)
//		{
//			r.keyPress(KeyEvent.VK_PAGE_DOWN);
//			r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//			Thread.sleep(2000);
//		}
//		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1500);");
		Thread.sleep(2000);
		
		driver.close();	
	}
}
