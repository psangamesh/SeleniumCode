package scrolldownandup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll 
{
	WebDriver driver;
	@Test
	public void Scrolldownadup() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		/*js.executeScript(("window.scrollBy(0,2500)"),"");//To down
		Thread.sleep(1000);
		js.executeScript(("window.scrollBy(0,-2000)"),"");//To up*/
		WebElement Element = driver.findElement(By.xpath("//a[normalize-space()=\"Try Selenium Testing For Free\"]"));
		js.executeScript("arguments[0].scrollIntoView();",Element);//scroll down till that feature is visible
		Thread.sleep(1000);
		
		
	
	}

}
