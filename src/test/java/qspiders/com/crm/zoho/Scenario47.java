package qspiders.com.crm.zoho;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario47
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		
		Alert al = driver.switchTo().alert();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.linkText("Confirm")).click();
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		String expectedAlert = driver.switchTo().alert().getText();
		String actualAlert = "Do you confirm?";
		if(expectedAlert.contains(actualAlert))
		{
			System.out.println("Alert Verification Message Is Successfull");
		}
		else
			System.out.println("Verification Failure");
		
		driver.switchTo().alert().dismiss();
		driver.close();
	}
}
