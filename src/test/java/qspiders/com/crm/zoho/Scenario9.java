package qspiders.com.crm.zoho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario9
{
		public static void main(String[] args) throws InterruptedException
		{
			String expectedURL = "https://www.flipkart.com/search?q=iphone%2016&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off";
			
			WebDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			WebElement searchTextField = driver.findElement(By.className("Pke_EE"));
			searchTextField.sendKeys("iphone 16");
			Thread.sleep(2000);
			WebElement searchIcon = driver.findElement(By.className("_2iLD__"));
			searchIcon.click();
			
			String actualURL = driver.getCurrentUrl();
			
			if (expectedURL.contains(actualURL))
			{
				System.out.println("Validation Succesfull");				
			}
			else
				System.out.println("Validation Failure");
			
			driver.close();
		}
}
