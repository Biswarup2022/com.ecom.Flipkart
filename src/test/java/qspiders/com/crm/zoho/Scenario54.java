package qspiders.com.crm.zoho;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario54 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		driver.findElement(By.linkText("Nested with Multiple iframe")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Admin@gmail.com");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin@1234");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.switchTo().frame(2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("Admin@1234");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.switchTo().frame(3);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
