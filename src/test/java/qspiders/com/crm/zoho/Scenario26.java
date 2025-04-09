package qspiders.com.crm.zoho;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario26
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement searchTextField = driver.findElement(By.className("Pke_EE"));
		searchTextField.sendKeys("iphone 16");
		Thread.sleep(2000);
		
		WebElement searchIcon = driver.findElement(By.className("_2iLD__"));
		searchIcon.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Price -- High to Low']")).click();
		Thread.sleep(2000);
				
		List<WebElement> addToComapreElements = driver.findElements(By.xpath("//span[text()='Add to Compare']"));
		for(int i=0;i<addToComapreElements.size();i++)
		{
			if(i==0 || i==2 || i==4 || i==addToComapreElements.size()-1)
			{
				addToComapreElements.get(i).click();
				Thread.sleep(1000);
			}
		}
			addToComapreElements.get(addToComapreElements.size()-2).click();
			Thread.sleep(2000);
			
			WebElement message = driver.findElement(By.xpath("//div[@class ='eIDgeN']"));
			if(message.isDisplayed())
			{
				System.out.println("Warning messege is displayed");
			}
			else
				System.out.println("Warning messege is not displayed");
		
		System.out.println(message.getText());
		Thread.sleep(1000);
		
		driver.close();
	}
}
