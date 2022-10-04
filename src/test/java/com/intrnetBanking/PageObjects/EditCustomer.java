package com.intrnetBanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomer 
{
	WebDriver ldriver;
	public EditCustomer(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[.='Edit Customer']")
	WebElement EditCutomer;
	
	public void Click_EditCutomer()

	{
		 EditCutomer.click();
	}
}
