package autosuggestiondropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto_Suggetion 
{
	WebDriver driver;
	@BeforeTest
	public void Setup() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	}
	
	@Test
	public void Auto_suggestion() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[normalize-space()=\"From\"]")).click();
		Thread.sleep(2000);
		WebElement Dropdown = driver.findElement(By.xpath("//input[contains(@placeholder,\"From\")]"));
		Dropdown.sendKeys("n");
		Thread.sleep(2000);
		Dropdown.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		Dropdown.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		Dropdown.sendKeys(Keys.ENTER);
	}

}
