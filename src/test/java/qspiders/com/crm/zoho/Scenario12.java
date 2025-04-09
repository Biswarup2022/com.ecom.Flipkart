package qspiders.com.crm.zoho;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario12
{
		public static void main(String[] args) throws InterruptedException 
		{
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://demoapps.qspiders.com/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			List<WebElement> links = driver.findElements(By.tagName("a"));
			for(WebElement link:links)
			{
				System.out.println(link.getText());
				Thread.sleep(1000);
			}
		
			
			
			
			
			
			
			
			
			
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.get("https://www.capgemini.com/");
				Thread.sleep(2000);
				List<WebElement> linked = driver.findElements(By.tagName("a"));
				System.out.println(linked);
				for(WebElement link:linked)
				{
					System.out.println(link.getText());
					Thread.sleep(1000);
				}
		 		driver.close();
		}
}
