package qspiders.com.crm.zoho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario17
{
			public static void main(String[] args) throws InterruptedException
			{
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demoapps.qspiders.com/ui?scenario=1");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//section[text()='Check Box']")).click();
				Thread.sleep(2000);
				
				driver.manage().window().minimize();
				
				String expectedURL = "https://demoapps.qspiders.com/ui/checkbox?sublist=0";
				String actualURL = driver.getCurrentUrl();
					if(actualURL.contains(expectedURL))
					{
						System.out.println("Checkbox Page is Displayed");
						System.out.println("Hence Validation Successfull");
					}
					else
						System.out.println("Validation Failure");
					Thread.sleep(5000);
					
					driver.manage().window().maximize();
					
					driver.findElement(By.id("domain4")).click();
					Thread.sleep(2000);
					
					driver.findElement(By.id("mode4")).click();
					Thread.sleep(2000);
										
					driver.findElement(By.id("mode6")).click();
					Thread.sleep(2000);
					
					driver.findElement(By.xpath("//input[@value='Continue']")).click();
					Thread.sleep(5000);
					
					driver.quit();
					
			}
}
