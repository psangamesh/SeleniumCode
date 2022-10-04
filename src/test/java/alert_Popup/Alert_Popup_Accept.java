package alert_Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Popup_Accept 
{

	WebDriver driver;
	@BeforeTest
	public void Setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("file:///F:/NOTES/popup.html");
		driver.manage().window().maximize();
		
	}
	@Test
	public void Accept_PopUp() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"selectTable\"]/tbody/tr[2]/td/button")).click();
	    Thread.sleep(5000);
		
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
		
	}
}
