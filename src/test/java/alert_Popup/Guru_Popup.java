package alert_Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Guru_Popup 
{
	WebDriver driver;
	@BeforeTest
	public void SetUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/manager/DeleteCustomerInput.php");
	}
	@Test
	public void Login() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input")).sendKeys("53920");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input[1]")).click();
		
		//Thread.sleep(2000);
		Alert alert= driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		Alert alert1= driver.switchTo().alert();
		alert.accept();
		
		
	}
	
}
