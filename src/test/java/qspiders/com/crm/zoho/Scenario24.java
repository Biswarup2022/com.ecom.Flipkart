package qspiders.com.crm.zoho;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario24
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
		
		driver.manage().window().minimize();
		Thread.sleep(1000);
		
		List<WebElement> productNames = driver.findElements(By.className("KzDlHZ"));
		
		List<WebElement> productPrices = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
		
		for(int i=0;i<productNames.size();i++)
		{
			System.out.println(productNames.get(i).getText()+" ----> "+productPrices.get(i).getText());
			Thread.sleep(1000);
		}
			
	driver.close();
	}
}
