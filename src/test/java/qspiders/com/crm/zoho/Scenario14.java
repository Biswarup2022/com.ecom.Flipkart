package qspiders.com.crm.zoho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario14
{
		public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			driver.get("https://demoapps.qspiders.com/ui?scenario=1");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			WebElement nameTextField = driver.findElement(By.id("name"));
			nameTextField.sendKeys("Biswarup Paul");
			Thread.sleep(2000);
			
			WebElement emailTextField = driver.findElement(By.name("email"));
			emailTextField.sendKeys("biswarup.paul880@gmail.com");
			Thread.sleep(2000);
			
			WebElement pwdTextField = driver.findElement(By.cssSelector("input[placeholder='Enter your password']"));
			pwdTextField.sendKeys("biswa@1234");
			Thread.sleep(2000);
//			pwdTextField.submit();
			
			WebElement registerIcon = driver.findElement(By.cssSelector("button[type='submit']"));
			registerIcon.click();
			Thread.sleep(2000);
			
			WebElement registerNowLink = driver.findElement(By.xpath("//a[text()"));
			registerNowLink.click();
			
//			WebElement loginemailTextField = driver.findElement(By.cssSelector("input[placeholder='Enter your email']"));
//			loginemailTextField.sendKeys("biswarup.paul880@gmail.com");
//			Thread.sleep(2000);
//			
//			WebElement pswdTextField = driver.findElement(By.cssSelector("input[placeholder='Enter your password']"));
//			pswdTextField.sendKeys("biswa@1234");
//			Thread.sleep(2000);
////			pswdTextField.submit();
//			
//			WebElement loginIcon = driver.findElement(By.cssSelector("button[type='submit']"));
//			loginemailTextField.click();
//			Thread.sleep(2000);
//			
//			driver.manage().window().minimize();
//			
//			List<WebElement> allLinks = driver.findElements(By.tagName("a"));
//			Thread.sleep(2000);
//			for(WebElement printLink:allLinks)
//			{
//				System.out.println(printLink.getText());
//				Thread.sleep(2000);
//			}
			
			driver.close();
			
		}
}
