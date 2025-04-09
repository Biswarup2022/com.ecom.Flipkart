package qspiders.com.crm.zoho;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser
{
	public static void main(String[] args) throws InterruptedException
	{
		String expectedTitle = "TotalEnergies - integrated multi-energy company | TotalEnergies.com";
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://totalenergies.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension (800,1600));
		Thread.sleep(2000);
		driver.manage().window().setPosition(new Point (200,300));
		Thread.sleep(2000);
		driver.navigate().to("https://www.capgemini.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links);
		for(WebElement link:links)
		{
			System.out.println(link.getText());
			Thread.sleep(2000);
		}
		
		String actualSourceCode = driver.getPageSource();
		System.out.println("The SourceCode of the page is :" +" "+actualSourceCode);
		Thread.sleep(2000);
		
		String actualTitle = driver.getTitle();
		if (actualTitle.equals(expectedTitle))
		{
			
			System.out.println("The title of the page is :"+actualTitle + "Validation Successful");
		}
		else
			System.out.println("Validation Failure");
		
		Thread.sleep(2000);
		String actualUrl = driver.getCurrentUrl();
		System.out.println("The URL of the page is :" +" "+actualUrl);
		driver.close();
		
	}
}
