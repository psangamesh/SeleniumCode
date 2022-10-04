package datepicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker02 
{
	WebDriver driver;
	@BeforeTest
	public void Setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.navigate().to("https://www.redbus.in/");
		driver.manage().window().maximize();
		
	}
    @Test
	public void datpick1()
	{
    	driver.findElement(By.xpath("//input[@id=\"onward_cal\"]")).click();
    	String year="2022";
		String month="Aug";
		String Day="15";
		
		while(true)
		{
			String el=driver.findElement(By.xpath("//td[@class=\"monthTitle\"]")).getText();
			String arr[]=el.split(" ");
			String mon=arr[0];
			String yr=arr[1];
			
			if(mon.equals(month)&&yr.equals(year))
			{
				break;
			}
			else
				driver.findElement(By.xpath("//button[normalize-space()=\">\"]")).click();
			
			List<WebElement> alldates= driver.findElements(By.xpath("//table[@class=\"rb-monthTable first last\"]//td"));
			for(WebElement adt:alldates)
			{
				String a = adt.getText();
				if(a.equals(Day))
				{
					adt.click();
					break;
				}
			}
		}
	}
}
