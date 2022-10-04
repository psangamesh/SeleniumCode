package alert_Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Automation 
{
	WebDriver driver;

	@Test
	public void Setup() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		WebElement SwithcTo = driver.findElement(By.xpath(" //a[normalize-space()=\"SwitchTo\"]"));
		WebElement alerts = driver.findElement(By.xpath(" //a[normalize-space()=\"Alerts\"]"));
		act.moveToElement(SwithcTo).perform();
		act.moveToElement(alerts).click().perform();
		
		Thread.sleep(6000);
		/*driver.findElement(By.xpath("//button[contains(text(),\"click the button to display an\")]")).click();
		
		Alert al=driver.switchTo().alert();
		al.accept();*/
		
		driver.findElement(By.xpath("//a[normalize-space()=\"Alert with Textbox\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()=\"click the button to demonstrate the prompt box\"]")).click();
		Alert al=driver.switchTo().alert();
		
		al.sendKeys("hi im sangaesh");
		
		al.accept();
	}
}
