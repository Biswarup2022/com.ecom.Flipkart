package qspiders.com.crm.zoho;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario49
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.className("Pke_EE")).sendKeys("iphone 16", Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (Black, 128 GB)' and (@class='KzDlHZ')]")).click();
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
		
		WebElement prodName = driver.findElement(By.xpath("//span[text()='Apple iPhone 16 (Black, 128 GB)']"));
		String productName = prodName.getText();
		if(productName.contains("Apple iPhone 16 (Black, 128 GB)"))
		{
			System.out.println("Product Name Validation is Successfull");
		}
		else
			System.out.println("Validation Failure");
		
		driver.quit();
	}
}
