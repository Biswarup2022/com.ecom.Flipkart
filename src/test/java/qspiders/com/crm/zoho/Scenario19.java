package qspiders.com.crm.zoho;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario19
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement searchTextField = driver.findElement(By.className("Pke_EE"));
		searchTextField.sendKeys("Oneplus mobile 5g");
		Thread.sleep(2000);

		driver.findElement(By.className("_2iLD__")).click();
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		
		List<WebElement> productList = driver.findElements(By.className("KzDlHZ"));
			for(WebElement printTitle:productList)
			{
				System.out.println(printTitle.getText());
				Thread.sleep(2000);
			}
			
		driver.close();
	}
}
