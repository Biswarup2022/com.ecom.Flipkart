package qspiders.com.crm.zoho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario10
{
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement nameTextField = driver.findElement(By.name("name"));
		nameTextField.sendKeys("Biswarup Paul");
		Thread.sleep(2000);
		WebElement mailTextField = driver.findElement(By.name("email"));
		mailTextField.sendKeys("biswarup.paul880@gmail.com");
		Thread.sleep(2000);
		WebElement pwdTextField = driver.findElement(By.name("password"));
		pwdTextField.sendKeys("biswa@1995");
		Thread.sleep(2000);
		pwdTextField.submit();
		Thread.sleep(2000);
		WebElement eidTextField = driver.findElement(By.name("email"));
		eidTextField.sendKeys("biswarup.paul880@gmail.com");
		Thread.sleep(2000);
		WebElement pswdTextField = driver.findElement(By.name("password"));
		pswdTextField.sendKeys("biswa@1995");
		Thread.sleep(2000);
		pswdTextField.submit();	
		Thread.sleep(2000);
		
		String expectedURL = "https://demoapps.qspiders.com/ui/login";	
		System.out.println("URL of the Page Should Be : "+ expectedURL);
		
		String actualURL = driver.getCurrentUrl();
		if(expectedURL.contains(actualURL))
		{
			System.out.println("The URL of the Page is : "+driver.getCurrentUrl());
			System.out.println("Hence Validation Successfull");
		}
		else
			System.out.println("Validation Failure");
		Thread.sleep(2000);
		driver.close();
	}
}
