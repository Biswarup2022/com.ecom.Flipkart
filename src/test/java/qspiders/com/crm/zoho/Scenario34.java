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

public class Scenario34
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Right Click']")).click();
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		WebElement firstRightClick = driver.findElement(By.id("btn30"));
		act.contextClick(firstRightClick).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Yes']")).click();
		Thread.sleep(2000);
		
		WebElement secondRightClick = driver.findElement(By.id("btn31"));
		act.contextClick(secondRightClick).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='No']")).click();
		Thread.sleep(2000);
		
		WebElement ratingOptions = driver.findElement(By.id("btn32"));
		act.contextClick(ratingOptions).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='5']")).click();
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\src\\main\\java\\Screenshots\\RightClick.png");
		Files.copy(src, dest);
		
		driver.close();
		
	}
}
