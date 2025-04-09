package qspiders.com.crm.zoho;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Scenario31
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text()='Date Picker']")).click();
		Thread.sleep(2000);
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 10);
		Date d = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String dateStamp = sdf.format(d) ;
		System.out.println(dateStamp);
		
		driver.findElement(By.xpath("//input[@placeholder='Select A Date']")).sendKeys(dateStamp);
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		File dest = new File("C:\\Users\\MOUMITA PAUL\\eclipse-workspace\\qspiders.com.crm.zoho\\src\\main\\java\\Screenshots\\Calendar10Days.png");
		Files.copy(src, dest);
		Thread.sleep(2000);
		
		driver.close();
	}
}
