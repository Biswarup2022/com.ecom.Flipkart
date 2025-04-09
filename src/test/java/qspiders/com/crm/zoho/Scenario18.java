package qspiders.com.crm.zoho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario18
{
		public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			driver.get("https://demoapps.qspiders.com/ui?scenario=1");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//section[text()='Button']")).click();
			Thread.sleep(2000);

			driver.findElement(By.id("btn")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("btn3")).click();
			Thread.sleep(2000);

			driver.findElement(By.id("btn8")).click();
			Thread.sleep(5000);
			
			driver.close();
				
		}
}
