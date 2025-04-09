package qspiders.com.crm.zoho;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario58 {
	public static void main(String[] args) throws Throwable {
		String fromCity = "Bengaluru";
		String toCity = "Kolkata";
		String depMonth = "April 2025";
		String depDate = "15";
		String expectedAdults = "4";
		String expectedChildrean = "2";
		String expectedInfants = "1";
		String expectedTravelClass = "First Class";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("commonModal__close")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(2000);		
//		driver.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(fromCity);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='react-autosuggest__suggestion react-autosuggest__suggestion--first']")).click();

		driver.findElement(By.id("toCity")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//p[text()='Pune, India']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(toCity);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='react-autosuggest__suggestion react-autosuggest__suggestion--first']")).click();	
		Thread.sleep(2000);
		
		WebElement depertureMonth = driver.findElement(By.xpath("//div[@class='DayPicker-Month']/div"));
		Thread.sleep(2000);
		int flag = 1;
		while(flag==1){
			if(depertureMonth.getText().equals(depMonth)) {
				flag=0;
			}
			else {
		driver.findElement(By.xpath("//span[@role='button' and @aria-label='Next Month']")).click();				
		Thread.sleep(2000);
			}
		}
//		driver.findElement(By.xpath("//span[@role='button' and @aria-label='Next Month']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[@role='button' and @aria-label='Next Month']")).click();
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='"+depMonth+"']/../following-sibling::div[@class='DayPicker-Body']//p[text()='"+depDate+"']")).click();
//		driver.findElement(By.xpath("//div[@aria-label='Wed Jun 04 2025']")).click();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//label[@for='travellers']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@data-cy='adults-"+expectedAdults+"']")).click();
//		driver.findElement(By.xpath("//li[@data-cy='adults-4']")).click();
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-cy='children-"+expectedChildrean+"']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-cy='infants-"+expectedInfants+"']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='"+expectedTravelClass+"']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		Thread.sleep(4000);
		driver.close();
		
		
	}
}
