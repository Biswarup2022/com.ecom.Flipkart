package qspiders.com.crm.zoho;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario51 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		String parentID = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Multiple Tabs']")).click();
		driver.findElement(By.xpath("//button[text()='Click to open multiple tabs']")).click();
		
		Set<String> allIDs = driver.getWindowHandles();
		String expectedURL = "https://demoapps.qspiders.com/ui/browser/Login";
		for(String thirdID : allIDs) {
			if(!parentID.equals(thirdID)) {
				driver.switchTo().window(thirdID);
				String actualURL = driver.getCurrentUrl();
				if(actualURL.equals(expectedURL)) {
					break;
				}
				Thread.sleep(2000);
			}
			
		}
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Robin", Keys.TAB, "Robin@123", Keys.ENTER);
		driver.quit();
	}
}
