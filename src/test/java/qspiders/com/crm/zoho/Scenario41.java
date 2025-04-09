package qspiders.com.crm.zoho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario41
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		WebElement mouseAction = driver.findElement(By.xpath("//section[text()='Mouse Actions']"));
		act.scrollToElement(mouseAction).perform();
		Thread.sleep(2000);
		mouseAction.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		Thread.sleep(2000);
		
		WebElement dragMe = driver.findElement(By.xpath("//div[text()='Drag Me']"));
		act.dragAndDropBy(dragMe, 100, -200).perform();
		Thread.sleep(4000);
		act.release().perform();
		driver.close();
	}
}
