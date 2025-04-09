package qspiders.com.crm.zoho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario22
{
		public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			WebElement searchTextField = driver.findElement(By.className("Pke_EE"));
			searchTextField.sendKeys("Oneplus 13 5g");
			Thread.sleep(2000);
			
			searchTextField.submit();
			Thread.sleep(2000);
			
			WebElement firstProduct = driver.findElement(By.xpath("//div[text()='OnePlus 13 (Midnight Ocean, 512 GB)']"));
			
			if (firstProduct.isDisplayed())
			{
				System.out.println("Validation Successfull");
			}
			else
			System.out.println("Validation Failure");
			Thread.sleep(2000);
			
			System.out.println(firstProduct.getText());
			Thread.sleep(2000);
			
			WebElement productPrice = driver.findElement(By.xpath("//div[text()='OnePlus 13 (Midnight Ocean, 512 GB)']/../following-sibling::div[@class='col col-5-12 BfVC2z']/div[@class='cN1yYO']/div[@class='hl05eU']/div[@class='Nx9bqj _4b5DiR']"));
			System.out.println("Price of the product is : "+productPrice.getText());
			Thread.sleep(2000);
			
			driver.close();
		}
}
