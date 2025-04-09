package qspiders.com.crm.zoho;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario53 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Robin@gmail.com", Keys.TAB, "Robin@123", Keys.ENTER);
		driver.switchTo().defaultContent();
//		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Nested iframe")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Admin@gmail.com", Keys.TAB, "Admin@1234", Keys.TAB, "Admin@1234", Keys.ENTER);
		driver.close();
	}
}
