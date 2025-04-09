package qspiders.com.crm.zoho;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario2
{
	public static void main(String[] args) throws InterruptedException
	{
		
		String expectedTitle = "Instagram";
		
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension (400,800));
		Thread.sleep(2000);
		driver.manage().window().setPosition(new Point (400,600));
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		String actualTitle = driver.getTitle();
		
		if (expectedTitle.contains(actualTitle))
				{
					System.out.println("Validation Succesful");
				}
		else
			System.out.println("Validation Faliure");
		
		System.out.println("The Current Url Of the Page Is :" + " "+driver.getCurrentUrl());
		System.out.println("The Title of the Page Is :"+" "+ driver.getTitle());
		driver.close();
	}
}
