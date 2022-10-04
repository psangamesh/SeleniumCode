package com.intrnetBanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn_Page
{
	WebDriver ldriver;

	public LogIn_Page(WebDriver rdriver)

	{
		ldriver=rdriver;
		PageFactory.initElements( rdriver,this);
	}
	@FindBy(name="uid")
	WebElement TxtUsername;
	@FindBy(name="password")
	WebElement TxtPass;
	@FindBy(name="btnLogin")
	WebElement BtnLogin;
	
	
	public void Set_UserName(String Uname)
	{
		TxtUsername.sendKeys(Uname);
	}
	public void Set_Password(String Passwd)
	{
		TxtPass.sendKeys(Passwd);
	}
	public void Click_LG_Button()
	{
		BtnLogin.click();
	}
	
}
