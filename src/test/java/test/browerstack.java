package test;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browerstack 
{
	WebDriver driver;
	@BeforeTest
	
	public void Setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/guide/wait-commands-in-selenium-webdriver");
		
		driver.manage().window().maximize();
	}
	@Test
	public void MouseOver()
	
	{
		String exp="Selenium Wait Commands : Implicit, Explicit & Fluent Wait | BrowserStack";
		String tact=driver.getTitle();
		Assert.assertEquals(tact, exp);
		System.out.println("Actual Title :"+tact);
		
		//Mouse Over actions
		
		WebElement button =driver.findElement(By.xpath("//button[@id='product-menu-toggle']"));
		WebElement button1=driver.findElement(By.xpath("//div[@class='dropdown-link-heading']"));
	
		Actions act=new Actions(driver);
		act.moveToElement(button).perform();
		act.moveToElement(button1).click().perform();							
		
		
	}

}
