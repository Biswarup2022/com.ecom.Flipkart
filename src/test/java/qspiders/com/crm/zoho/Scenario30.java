package qspiders.com.crm.zoho;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Scenario30
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Puma Shoes");
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		File dest = new File("C:\\Users\\MOUMITA PAUL\\eclipse-workspace\\qspiders.com.crm.zoho\\src\\main\\java\\Screenshots\\PumaScreenshot.png");
		Files.copy(src, dest);
		
		driver.close();
	}
}
