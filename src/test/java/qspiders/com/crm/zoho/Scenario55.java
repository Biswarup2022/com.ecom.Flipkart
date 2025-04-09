package qspiders.com.crm.zoho;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Scenario55 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("fileInput")).sendKeys("C:\\Users\\MOUMITA PAUL\\Pictures\\Saved Pictures\\S1.jpg");
		
//		Calendar cal = Calendar.getInstance();
//		Date d = (Date) cal.getTime();
//		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh-mm-ss");
//		String dateTimeStamp = sdf.format(d);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\MOUMITA PAUL\\MyEclipse\\com.ecom.Flipkart\\src\\main\\java\\Screenshots\\FileUpload.png");
		Files.copy(src, dest);
		driver.close();
	}
}
