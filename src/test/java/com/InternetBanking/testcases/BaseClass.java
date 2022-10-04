package com.InternetBanking.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.internetbankiing.utilitiies.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 

{
	ReadConfig readconfig=new ReadConfig ();
	
	public String baseUrl=readconfig.getApplicationUrl();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	public ExtentSparkReporter htmlreporter;
	public ExtentReports extent;
	public ExtentTest test;

	@BeforeClass
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		htmlreporter=new ExtentSparkReporter(System.getProperty("user,dir")+ "\\report\\MyReport.html");
		htmlreporter.config().setDocumentTitle("Automation Report");
		htmlreporter.config().setReportName("Functional TestCase Report");
		htmlreporter.config().setTheme(Theme.STANDARD);
		
		 extent=new ExtentReports();
		 extent.attachReporter(htmlreporter);
		 extent.setSystemInfo("HostName","LocalHost");
		 extent.setSystemInfo("OS","Windows10");
		 extent.setSystemInfo("Browser","ChromeBrowser");
		 extent.setSystemInfo("TesterName","SANGAMESH");
		
		
	}

	@AfterClass
	public void Teardown()
	{
		extent.flush();
		driver.quit();
		
	}
	
}
