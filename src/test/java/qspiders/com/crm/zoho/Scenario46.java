package qspiders.com.crm.zoho;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario46
{
	public static void main(String[] args) throws AWTException, InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123", Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		
		driver.findElement(By.xpath("//label[text()='Employee Name']/../following-sibling::div/div/div/input")).sendKeys("Robin");
//		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Robin");
		
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active' and not (@placeholder='Search')]")).sendKeys("1234");
//		driver.findElement(By.xpath("(//input[contains(@class,'oxd-input')])[2]")).sendKeys("002");
		
		driver.findElement(By.xpath("//label[text()='Employment Status']/../following-sibling::div/div/div")).click();
		Robot r = new Robot();
		for(int i=0; i<3; i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		driver.close();
		
	}
}
