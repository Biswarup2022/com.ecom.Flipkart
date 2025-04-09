package qspiders.com.crm.zoho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario16
{
		public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			Thread.sleep(2000);
			
			WebElement searchTextField = driver.findElement(By.className("Pke_EE"));
			searchTextField.sendKeys("iphone 16");
			Thread.sleep(2000);

			WebElement searchIcon = driver.findElement(By.className("_2iLD__"));
			searchIcon.click();
			Thread.sleep(2000);
			
			String expectedURL = "https://www.flipkart.com/search?q=iphone%2016&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off";
			String actualURL = driver.getCurrentUrl();
			
				if(actualURL.contains(expectedURL))
				{
					System.out.println("Validation Successfull");
					Thread.sleep(2000);
				}
				else
					System.out.println("Validation Failure");
				
				WebElement firstProduct = driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (Black, 128 GB)']"));
				System.out.println(firstProduct.getText());
				Thread.sleep(2000);
				
				firstProduct.click();
				Thread.sleep(5000);

				driver.close();
				driver.quit();
		}
}
