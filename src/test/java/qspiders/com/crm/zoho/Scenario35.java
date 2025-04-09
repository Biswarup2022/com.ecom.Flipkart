package qspiders.com.crm.zoho;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Scenario35
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("Button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Double Click']")).click();
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		WebElement firstDoubleClick = driver.findElement(By.id("btn21"));
		act.doubleClick(firstDoubleClick).perform();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		WebElement actualFirstMessage = driver.findElement(By.xpath("//span[text()='You selected \"No\"']"));
			if(actualFirstMessage.isDisplayed())
			{
				System.out.println(actualFirstMessage.getText());
				System.out.println("First Message Validation Successfull.");
			}
			else
				System.out.println("Validation Failure");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
		WebElement secondDoubleClick = driver.findElement(By.id("btn22"));
		act.doubleClick(secondDoubleClick).perform();	
		Thread.sleep(2000);
		driver.manage().window().minimize();
		WebElement actualSecondMessage = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']"));
		if(actualSecondMessage.isDisplayed())
		{
			System.out.println(actualSecondMessage.getText());
			System.out.println("Second Message Validation Successfull.");
		}
		else
			System.out.println("Validation Failure");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
			
		WebElement ratingDoubleClick = driver.findElement(By.id("btn24"));
		act.doubleClick(ratingDoubleClick).perform();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		WebElement actualRatingMessage = driver.findElement(By.xpath("//span[text()='You selected \"1\"']"));
		if(actualRatingMessage.isDisplayed())
		{
			System.out.println(actualRatingMessage.getText());
			System.out.println("Rating Message Validation Successfull.");
		}
		else
			System.out.println("Validation Failure");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		File dest = new File(".\\src\\main\\java\\Screenshots\\DoubleClick.png");
		Files.copy(src, dest);
		
		driver.close();
		
	}
}
