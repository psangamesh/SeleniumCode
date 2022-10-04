package Mouseover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Over_Action 
{
	WebDriver driver;
	@BeforeTest
	
	public void Setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		
	}

	@Test
	public void MouseOver()
	{
		WebElement DeskMain = driver.findElement(By.xpath("//a[normalize-space()=\"Desktops\"]"));
		WebElement mac = driver.findElement(By.xpath("//a[normalize-space()=\"Mac (1)\"]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(DeskMain).perform();
		act.moveToElement(mac).click().perform();
	}
}
