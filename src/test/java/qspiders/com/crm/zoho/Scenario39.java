package qspiders.com.crm.zoho;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario39
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		WebElement homePointer = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		act.moveToElement(homePointer).perform();
		Thread.sleep(2000);
		
		WebElement livingPointer = driver.findElement(By.linkText("Living Room Furniture"));
		act.moveToElement(livingPointer).perform();
		Thread.sleep(2000);
		
		List<WebElement> productLists = driver.findElements(By.xpath("//a[@class='_3490ry']"));
		for(WebElement printProduct:productLists)
		{
			String sProducts = printProduct.getText();
				if(sProducts!=null && sProducts.startsWith("S"))
				{
					System.out.println(sProducts);
					Thread.sleep(2000);
				}
		}			
	driver.close();
	}
}
