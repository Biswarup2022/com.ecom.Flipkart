package qspiders.com.crm.zoho;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario52 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("Pke_EE")).sendKeys("iphone 16", Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (Black, 128 GB)' and(@class ='KzDlHZ')]")).click();
		String parentID = driver.getWindowHandle();
		Set<String> allIDs = driver.getWindowHandles();
		for(String nextID : allIDs) {
			if(!nextID.equals(parentID)) {
				driver.switchTo().window(nextID);
				Thread.sleep(2000);
			}
		}
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,3700);");
		Thread.sleep(2000);
		driver.findElement(By.className("//button[contains(@class,'QqFHMw vslbG+ In9uk2')]")).click();
		Thread.sleep(2000);

		WebElement productName = driver.findElement(By.xpath("//a[text()='Apple iPhone 16 (Black, 128 GB)']"));
		if(productName.isDisplayed()) {
			System.out.println(productName.getText()+"Product Name is Displayed Successfully");
		}
		else
			System.out.println("Product Name Validation is Failure");
		driver.quit();
	}			
}
