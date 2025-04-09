package qspiders.com.crm.zoho;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Scenario32
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("Robin2025");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("Robin@123",Keys.ENTER);
		Thread.sleep(2000);
		
			Calendar cal = Calendar.getInstance();
			Date d = cal.getTime();
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY hh-mm-ss");
			String dateTimeStamp = sdf.format(d);
		
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src =ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\MOUMITA PAUL\\eclipse-workspace\\qspiders.com.crm.zoho\\src\\main\\java\\Screenshots\\InstaScreenshot-"+dateTimeStamp+".png");
			Files.copy(src, dest);
			Thread.sleep(1000);			
		
		driver.close();
	}
}
