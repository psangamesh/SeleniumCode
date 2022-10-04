package drop_down;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_1 
{
@Test
public void Handle_DropDown() 
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.opencart.com/index.php?route=account/register");
	WebElement drpcountyrele = driver.findElement(By.id("input-country"));
	Select drpcountyr=new Select( drpcountyrele);
	//drpcountyr.selectByVisibleText("Denmark");
	//drpcountyr.selectByValue("4");
	//drpcountyr.selectByIndex(12);
	
	//Selecting options from Dropdown without using Select Class
	String searchtext="Cuba";
	List<WebElement> allOptions = drpcountyr.getOptions();
	for(WebElement option:allOptions)
	{
		if(option.getText().equals(searchtext))
		{
			option.click();
			break;
		}
	}
}
	
}
