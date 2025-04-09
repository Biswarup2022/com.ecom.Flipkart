package qspiders.com.crm.zoho;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImageScenario {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Image']")).click();
		driver.findElement(By.linkText("Link Image")).click();
		
		Actions act=new Actions(driver);
		act.click(driver.findElement(By.xpath("//a[@title='Mens Clothing']"))).perform();
		
		WebElement menClothingPage = driver.findElement(By.xpath("//h1[text()='This is men clothing section']"));
		if(menClothingPage.isDisplayed()) {
			System.out.println("Image file handled successfully");
		}
			else
				System.out.println("Validation Failure");
		
		driver.close();
	}

}
