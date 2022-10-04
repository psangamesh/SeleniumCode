package datepicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date_Picker_With_Drp_Down 
{
	WebDriver driver;
	@BeforeTest
	public void SetUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		
		
	}
	
	@Test
	public void datePicker() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id=\"datepicker2\"]")).click();
		Select sel=new Select(driver.findElement(By.xpath("//select[@title=\"Change the month\"]")));
		sel.selectByVisibleText("March");
		
		Thread.sleep(1000);
		
		Select sel1=new Select(driver.findElement(By.xpath("//select[@title=\"Change the year\"]")));
		sel1.selectByVisibleText("2024");
		
		String day="23";
		
		List<WebElement> alldate = driver.findElements(By.xpath("//div[@class=\"datepick-month\"]//td"));
		for(WebElement selday:alldate)
		{
			String ele=selday.getText();
			if(ele.equals(day))
			{
				selday.click();
				break;
			}
			
		}
	}

}
