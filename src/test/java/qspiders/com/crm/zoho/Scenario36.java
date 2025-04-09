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

public class Scenario36
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		Actions act = new Actions(driver);
		WebElement mouseActions = driver.findElement(By.xpath("//section[text()='Mouse Actions']"));
		act.scrollToElement(mouseActions).perform();
		Thread.sleep(2000);
				
		act.click(mouseActions).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Click & Hold")).click();
		Thread.sleep(2000);
			
		WebElement clickCircle = driver.findElement(By.id("circle"));
		act.clickAndHold(clickCircle).perform();
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\src\\main\\java\\Screenshots\\CircleScreenshot.png");
		Files.copy(src, dest);
		
		act.release().perform();
		Thread.sleep(2000);
		
		driver.close();
	}
}
