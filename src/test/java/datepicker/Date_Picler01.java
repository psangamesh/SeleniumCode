package datepicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date_Picler01 
{
	WebDriver driver;
	@BeforeTest
	public void setup()

	{
		WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
        
	}
	@Test
	
	public void datepick()
	{
		driver.findElement(By.xpath("//div[@class=\"fl search-box date-box gtm-onwardCalendar\"]")).click();
		
		String year="2022";
		String Month="Aug";
		String Dat="15";
		
		while(true)
		
		{
			String ele = driver.findElement(By.xpath("//td[@class=\"monthTitle\"]")).getText();
			String arr[]=ele.split(" ");
			String mon=arr[0];
			String yr=arr[1];
			
			if(mon.equals(Month)&&yr.equals(year))
			break;
			else 
				driver.findElement(By.xpath("//button[normalize-space()=\">\"]")).click();
				
			List<WebElement> alldates = driver.findElements(By.xpath("//div[@id=\"rb-calendar_onward_cal\"]//td"));
				for(WebElement dt:alldates)
				{
					String d=dt.getText();
					if(d.equals(Dat))
					{
						dt.click();
						break;
					}
				}
				
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
