package qspiders.com.crm.zoho;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario56 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		driver.findElement(By.linkText("Custom Button")).click();
		
		StringSelection path = new StringSelection("C:\\Users\\MOUMITA PAUL\\Pictures\\Saved Pictures\\S1.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		
		driver.findElement(By.xpath("//div[text()='Upload File']")).click();
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[name()='svg' and @class='text-red-600 text-lg cursor-pointer']")).click();
		Thread.sleep(2000);

		driver.close();
	}
}
