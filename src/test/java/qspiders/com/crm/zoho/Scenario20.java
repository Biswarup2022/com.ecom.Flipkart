package qspiders.com.crm.zoho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario20
{
		public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			driver.get("https://demoapps.qspiders.com/ui?scenario=1");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//li[text()='Without placeholder']")).click();
			Thread.sleep(2000);
			
			WebElement nameTextField = driver.findElement(By.name("name"));
			nameTextField.sendKeys("Biswarup Paul");
			Thread.sleep(2000);
			
			WebElement emailTextField = driver.findElement(By.name("email"));
			emailTextField.sendKeys("biswarup.paul880@gmail.com");
			Thread.sleep(2000);

			WebElement pwdTextField = driver.findElement(By.name("password"));
			pwdTextField.sendKeys("biswa@1234");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[text()='Register']")).click();
			Thread.sleep(2000);
		
			driver.close();
		}
}
