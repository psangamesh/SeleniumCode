package Slider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider
{
	 
	
		WebDriver driver;
		@BeforeTest
		public void Setup() throws InterruptedException
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Slider.html");
			driver.manage().window().maximize();
			
		}

		@Test
		public void slider()
		{
			WebElement slide = driver.findElement(By.xpath("//a[@class=\"ui-slider-handle ui-state-default ui-corner-all\"]"));
			
			Actions act=new Actions(driver);
			act.dragAndDropBy(slide, 500, 0);
		}
}
