package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreeshot 
{
	@Test
	public void Takeshot() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/?utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab&dxid=Cj0KCQjwhqaVBhCxARIsAHK1tiNWNtCsw7-S8sxGpnqJCJOO7zuX_WSYTLXCCeG4ZBbShcJj8pfx83AaAhkyEALw_wcB&gclid=Cj0KCQjwhqaVBhCxARIsAHK1tiNWNtCsw7-S8sxGpnqJCJOO7zuX_WSYTLXCCeG4ZBbShcJj8pfx83AaAhkyEALw_wcB");
		driver.manage().window().maximize();
		//Full page Screenshot
		TakesScreenshot Ts=(TakesScreenshot)driver;
		File src=Ts.getScreenshotAs(OutputType.FILE);
		File target=new File(".\\Screenshot\\homepage.png");
		FileUtils.copyFile(src, target);
		
		//screenshot some portion
		/*WebElement ts = driver.findElement(By.xpath("//*[@id=\"ph-topic\"]/div[2]/div/div[1]/div[4]/h2"));
		File src=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(".\\Screenshot\\homepage.png");
		FileUtils.copyFile(src, target);*/
		
		driver.close();
	}

}
