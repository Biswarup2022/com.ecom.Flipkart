package qspiders.com.crm.zoho;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario11
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gclid=CjwKCAiAtNK8BhBBEiwA8wVt9wlKgiqj_X5jNUtGQGUi-L0joUoq4zaRx9_HNAVppGZnzsn63D_YqRoC7o8QAvD_BwE");
		Thread.sleep(2000);
		
		WebElement searchTextField = driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
		searchTextField.sendKeys("Puma Shoes");
		Thread.sleep(2000);
		WebElement searchIcon = driver.findElement(By.cssSelector(" a[data-reactid='875']"));
		searchIcon.click();
		Thread.sleep(2000);
		String expectedURL = "https://www.myntra.com/puma-shoe";
		String actualURL = driver.getCurrentUrl();
		
		if(actualURL.contains(expectedURL))
		{
			System.out.println("Validate Succesfull");
		}
		else
			System.out.println("Validation Failure");
		driver.close();
	
	}
	
}
