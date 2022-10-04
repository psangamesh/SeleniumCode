package guru_Package;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Log_In extends Base_Class
{

	@Test
	public void uplaod_File() throws InterruptedException, AWTException
	
	{
		
		//driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("F:\\NOTES\\SELENIUM WORD NOTES.docx");
		
		//If There is no type="file " in console 
				//We need to Use ROBOT class
		//if click action not works
		//by using JavaScriptExicutor
		WebElement Uploadfile = driver.findElement(By.xpath("//input[@type='file']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",Uploadfile);
		
		Robot Rb=new Robot();
		Rb.delay(2000);
		
		StringSelection ss= new StringSelection("F:\\NOTES\\SELENIUM WORD NOTES.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		
		Rb.keyPress(KeyEvent.VK_CONTROL);
		Rb.keyPress(KeyEvent.VK_V);
		
		
		
		Rb.keyRelease(KeyEvent.VK_CONTROL);
		Rb.keyRelease(KeyEvent.VK_V);
		
		Rb.keyPress(KeyEvent.VK_ENTER);
		Rb.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	
}
