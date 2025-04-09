package qspiders.com.crm.zoho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario25
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text()='Check Box']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Selected']")).click();
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		
		WebElement emailCheckbox = driver.findElement(By.id("domain1"));
		Thread.sleep(2000);
		if(emailCheckbox.isSelected())
		{
			System.out.println("Email Checkbox is Selected");
		}
		else
			System.out.println(" Email Checkbox is not Selected");
		Thread.sleep(2000);
		
		WebElement sandalsCheckBox = driver.findElement(By.id("mode1"));
		Thread.sleep(2000);
		if(sandalsCheckBox.isSelected())
		{
			System.out.println("Sandals Checkbox is Selected");
		}
		else
			System.out.println(" Sandals Checkbox is not Selected");
		
		WebElement regardingCheckbox = driver.findElement(By.id("mode5"));
		Thread.sleep(2000);
		if(regardingCheckbox.isSelected())
		{
			System.out.println("Regaring the same Product Checkbox is Selected");
		}
		else
			System.out.println("Checkbox is not Selected");
		Thread.sleep(2000);

		driver.close();
		
	}
}
