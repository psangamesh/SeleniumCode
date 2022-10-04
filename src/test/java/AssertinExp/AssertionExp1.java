package AssertinExp;

import static org.testng.Assert.assertTrue;

import java.sql.Time;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionExp1 
{
	WebDriver driver;
	@BeforeTest
	public void Setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//driver.get("https://www.browserstack.com/");
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	
		
		
	}
	@Test
	public void TitleSearch()
	{
		/*String ActalTitle=driver.getTitle();
		String exp="Most Reliable App & Cross Browser Testing Platform | BrowserStack";
		Assert.assertEquals(exp,ActalTitle);
		System.out.println(ActalTitle);*/
		/*boolean VarifyTitle = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
		assertTrue(VarifyTitle);*/
		
	/*WebElement ele = driver.findElement(By.xpath("//*[text()='Sign in']"));
	System.out.println("Element with text(): " + ele.getText() );*/
	
	/*WebElement ele = driver.findElement(By.xpath("//h1[text()='Automation Demo Site ']"));
	System.out.println("Element with text(): " + ele.getText() );*/
	String ActalTitle="Automation Demo Site";
	String exp="Automation Demo Site";
	Assert.assertEquals(exp,ActalTitle);
	System.out.println(ActalTitle);
	}

}
