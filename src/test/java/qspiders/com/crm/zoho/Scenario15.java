package qspiders.com.crm.zoho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario15
{
		public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://demoapps.qspiders.com/ui?scenario=1");
			Thread.sleep(2000);

			WebElement radioButtonLink = driver.findElement(By.xpath("//section[text()='Radio Button']"));
			radioButtonLink.click();
			Thread.sleep(2000);
			
			WebElement codButtonLink = driver.findElement(By.xpath("//input[@value='cod']"));
			codButtonLink.click();
			Thread.sleep(2000);

			WebElement deliveryButtonLink = driver.findElement(By.xpath("//input[@id='willin2']"));
			deliveryButtonLink.click();
			Thread.sleep(2000);
			
			WebElement continueButtonLink = driver.findElement(By.xpath("//button[text()='Continue']"));
			continueButtonLink.click();
			Thread.sleep(5000);
			
			driver.close();
		}
}
