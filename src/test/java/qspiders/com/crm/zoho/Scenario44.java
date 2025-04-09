package qspiders.com.crm.zoho;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario44
{
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		WebElement countryDD = driver.findElement(By.id("select3"));
		Select sel = new Select(countryDD);
		sel.selectByVisibleText("India");
		
		WebElement stateDD = driver.findElement(By.id("select5"));
		Select sl = new Select(stateDD);
		
		driver.manage().window().minimize();
		List<WebElement> optionNames = sl.getOptions();
		ArrayList<String> stateNames = new ArrayList<String>();
			for(WebElement eachNames:optionNames)
			{
				stateNames.add(eachNames.getText());
			}
			
		Collections.sort(stateNames);
			for(String name:stateNames)
			{
				System.out.println(name);
			}
			
		driver.close();	
	}
}
 