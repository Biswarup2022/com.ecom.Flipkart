  package qspiders.com.crm.zoho;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario50 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		driver.findElement(By.linkText("Open in new window")).click();
		
		String parentID = driver.getWindowHandle();
		Set<String> allIDs = driver.getWindowHandles();
		for(String nextID : allIDs) {
			if(!nextID.equals(allIDs)) {
				driver.switchTo().window(nextID);
			}
		}
		String childWindowID = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("Robin123@gmail.com", Keys.TAB, "Robin@123", Keys.TAB, "Robin@123", Keys.ENTER);
		Thread.sleep(2000);
		
		driver.switchTo().window(parentID);
		Thread.sleep(2000);
		driver.findElement(By.linkText("New Tab")).click();
		driver.findElement(By.xpath("//button[text()='Open window in new Tab']")).click();
		Thread.sleep(2000);
		
		allIDs = driver.getWindowHandles();
		for(String thirdID : allIDs) {
			if(thirdID!=parentID && thirdID!=childWindowID) {
				driver.switchTo().window(thirdID);
			}
		}
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).sendKeys("Robin123@gmail.com", Keys.TAB, "Robin@123", Keys.TAB, "Robin@123", Keys.ENTER);
		Thread.sleep(2000);
		for(String id : allIDs) {
			driver.switchTo().window(id);
			driver.close();
			Thread.sleep(2000);
		}
		
	}
}
