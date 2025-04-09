package qspiders.com.crm.zoho;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario43
{
	public static void main (String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		
		WebElement phoneNumberDD = driver.findElement(By.id("select1"));
		Select sel = new Select(phoneNumberDD);
		sel.selectByIndex(0);
		
		WebElement genderDD = driver.findElement(By.id("select2"));
		Select select = new Select(genderDD);
		select.selectByValue("male");
		
		WebElement countryDD = driver.findElement(By.id("select3"));
		Select sl = new Select(countryDD);
		sl.selectByVisibleText("India");
		driver.close();
		
	}
}
