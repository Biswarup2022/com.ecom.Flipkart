package qspiders.com.crm.zoho;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProductList
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement searchTextField = driver.findElement(By.id("twotabsearchtextbox"));
		searchTextField.sendKeys("samsung 5g phone");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains (text(),'Samsung Galaxy M05 (Mint Green, 4GB RAM, 64 GB Storage) | 50MP Dual Camera | Bigger 6.7\" HD+ Display')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()=' Buy Now ']")).click();
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		List<WebElement> productNames = driver.findElements(By.xpath("//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal']"));
		
		List<WebElement> productPrices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		for(int i=0;i<productNames.size();i++)
		{
			System.out.println(productNames.get(i).getText()+" ----> "+productPrices.get(i).getText());
			Thread.sleep(2000);
		}
		
		driver.close();
	}
}
