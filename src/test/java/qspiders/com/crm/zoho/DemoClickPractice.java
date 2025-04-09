package qspiders.com.crm.zoho;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class DemoClickPractice
{
		public static void main(String[] args) throws InterruptedException, IOException
		{
			WebDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			driver.get("https://demoapps.qspiders.com/ui?scenario=1");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);

			WebElement clickButton = driver.findElement(By.linkText("Button"));
			clickButton.click();
			Thread.sleep(2000);
			
			WebElement yesButton1 = driver.findElement(By.id("btn"));
			yesButton1.click();
			Thread.sleep(2000);
			
			WebElement noButton1 = driver.findElement(By.id("btn1"));
			noButton1.click();
			Thread.sleep(2000);
			
			WebElement yesButton2 = driver.findElement(By.id("btn2"));
			yesButton2.click();
			Thread.sleep(2000);
			
			WebElement noButton2 = driver.findElement(By.id("btn3"));
			noButton2.click();
			Thread.sleep(2000);
			
			WebElement ratingButton = driver.findElement(By.id("btn7"));
			ratingButton.click();
			Thread.sleep(2000);
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\MOUMITA PAUL\\eclipse-workspace\\qspiders.com.crm.zoho\\src\\main\\java\\Screenshots\\DemoClickImage.png");
			Files.copy(src, dest);
			
			WebElement linkButton = driver.findElement(By.linkText("Link"));
			linkButton.click();
			Thread.sleep(2000);
			driver.manage().window().minimize();
			
			List<WebElement> linkVisibleTexts = driver.findElements(By.tagName("a"));
			
			for(WebElement printTexts:linkVisibleTexts)
			{
				System.out.println(printTexts.getText());
				Thread.sleep(2000);
			}
				
			driver.close();
		}
}
