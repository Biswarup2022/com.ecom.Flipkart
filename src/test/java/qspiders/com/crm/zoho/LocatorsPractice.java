package qspiders.com.crm.zoho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {
			public static void main(String[] args) throws InterruptedException {
				WebDriver driver = new ChromeDriver();
				Thread.sleep(2000);
				driver.get("https://www.facebook.com/");
				Thread.sleep(2000);
				driver.manage().window().maximize();
				Thread.sleep(2000);
				WebElement emailTextField = driver.findElement(By.id("email"));
				emailTextField.sendKeys("abc@gmail.com");
				Thread.sleep(2000);
				WebElement passwordTextField = driver.findElement(By.name("pass"));
				passwordTextField.sendKeys("papai@1234");
				Thread.sleep(2000);
				driver.navigate().refresh();
				driver.close();
				
			}
}
