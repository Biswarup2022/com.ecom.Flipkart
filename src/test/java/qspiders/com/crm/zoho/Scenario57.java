package qspiders.com.crm.zoho;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario57 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.querySelector(\"#name\").removeAttribute('disabled');");
		Thread.sleep(2000);
		jse.executeScript("document.querySelector(\"#email\").removeAttribute('disabled');");
		Thread.sleep(2000);
		jse.executeScript("document.querySelector(\"#password\").removeAttribute('disabled');");
		Thread.sleep(2000);
		
		driver.findElement(By.id("name")).sendKeys("Robin", Keys.TAB, "Robin@gmail.com", Keys.TAB, "Robin@123", Keys.ENTER);
		Thread.sleep(2000);
		
		driver.close();
 	}
}
