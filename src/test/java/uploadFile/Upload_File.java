package uploadFile;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_File 
{

	@Test
	public void UpldFle() throws AWTException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"user-signup-actions\"]/div[1]/div[1]/a[2]")).click();
		//Sendkeys function used if type="file " is there in console 
		//driver.findElement(By.xpath("//*[@id=\"file-upload\"]")).sendKeys("F:\\NOTES\\SELENIUM WORD NOTES.docx");
		
		//If There is no type="file " in console 
		//We need to Use ROBOT class
		
		//driver.findElement(By.xpath("//*[@id=\"file-upload\"]")).click();
		//if click action not works
		
		//by using JavaScriptExicutor
		WebElement button = driver.findElement(By.xpath("//*[@id=\"file-upload\"]"));
		JavascriptExecutor Js=(JavascriptExecutor)driver;
		Js.executeScript("arguments[0].click();",button);
		
		/*
		 1]copy the file path
		 2]CTRL+V
		 3]PRESS ENTER KEY
		 */
		Robot rb = new Robot();
		rb.delay(2000);
		
		//1]copy the file path
		StringSelection SS=new StringSelection("F:\\NOTES\\SELENIUM WORD NOTES.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(SS,null);
		
		//2]CTRL+V
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		//release button
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		//3]PRESS ENTER KEY
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
	
}
