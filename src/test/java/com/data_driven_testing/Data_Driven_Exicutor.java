package com.data_driven_testing;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_Driven_Exicutor 
{

	WebDriver driver;
	@BeforeTest()
	public void Setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/");
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider="logindata")
	public void Login(String UserID, String password) throws InterruptedException 
	{
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(UserID);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
	}
	
	@DataProvider(name="logindata")
	public String [][] Getdata() throws IOException
	{
		String path=".\\datafiles\\GuruDDT.xlsx";
		XLUitility util=new XLUitility(path);
		int totalrows=util.Get_RoWCount("Sheet1");
		int totalcols=util.Get_Cell_count("sheet1", 1);
		
		String logindata[][]=new String[totalrows][totalcols];
		for(int i=1;i<=totalrows;i++) 
		{
			for(int j=0;j<totalcols;j++)
			{
				logindata[i-1][j]=util.Get_cell_Data("Sheet1", i, j);
			}
			
		}
		
		return logindata;
	}
	public void teardown()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
