package qspiders.com.crm.zoho;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario48
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//section[text()='Scroll']")).click();
		driver.findElement(By.xpath("//section[text()='Scroll' and (@class='poppins text-[14px]')]")).click();
		driver.findElement(By.xpath("//a[text()='Horizontal']")).click();
		driver.findElement(By.linkText("Open In New Tab")).click();
		
		String parentID = driver.getWindowHandle();
		Set<String> allIDs = driver.getWindowHandles();
			for(String nextID : allIDs)
			{
				if(!nextID.equals(parentID))
				{
					driver.switchTo().window(nextID);
					Thread.sleep(2000);
				}
			}
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(7070,4200);");
		Thread.sleep(2000);
		driver.quit();
	}
}
