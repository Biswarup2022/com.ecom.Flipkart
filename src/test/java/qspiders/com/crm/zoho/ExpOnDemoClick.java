package qspiders.com.crm.zoho;

import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpOnDemoClick {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		WebElement name = driver.findElement(By.id("name"));
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		name.sendKeys("Admin");
		
	}
}
