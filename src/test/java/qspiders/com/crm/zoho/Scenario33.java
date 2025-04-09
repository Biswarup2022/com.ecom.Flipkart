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

public class Scenario33
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement electronicsPointer = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions act = new Actions(driver);
		Thread.sleep(2000);		
		act.moveToElement(electronicsPointer).perform();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\MOUMITA PAUL\\eclipse-workspace\\qspiders.com.crm.zoho\\src\\main\\java\\Screenshots\\Electronics Pointer.png");
		Files.copy(src, dest);
		
		driver.close();
		
	}
}
