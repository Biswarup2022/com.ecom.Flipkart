package qspiders.com.crm.zoho;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario45
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		
		WebElement phoneNumberDD = driver.findElement(By.id("select1"));
		Select sel = new Select(phoneNumberDD);
		sel.selectByVisibleText("+91");
		System.out.println(sel.getFirstSelectedOption().getText());
		driver.close();
	}
}
