package com.intrnetBanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_customer_Page 
{
	WebDriver ldriver;
	public Add_customer_Page(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy( xpath="//a[.='New Customer']")
	WebElement Newcutomeradd;
	@FindBy(name="name")
	WebElement CustomerName;
	@FindBy(name="rad1")
	WebElement Gender;
	@FindBy(name="dob")
	WebElement DateBirth;
	@FindBy(name="addr")
	WebElement Address;
	@FindBy(name="city")
	WebElement City;
	@FindBy(name="state")
	WebElement State;
	@FindBy(name="pinno")
	WebElement PinNumber;
	@FindBy(name="telephoneno")
	WebElement MobileNumber;
	@FindBy(name="emailid")
	WebElement EmailID;
	@FindBy(name="password")
	WebElement CPassword;
	@FindBy(name="sub")
	WebElement SubmitButton;
	
	public void Click_NewCutomer()
	{
		Newcutomeradd.click();
	}
	
	public void Set_Customer_Name(String CName)
	{
		CustomerName.sendKeys(CName);
	}
	
	public void Sel_Gender()
	{
		Gender.click();
	}
	public void Set_DOB(String dd,String mm,String yy)
	{
		 DateBirth.sendKeys(dd);
		 DateBirth.sendKeys(mm);
		 DateBirth.sendKeys(yy);
	}
	public void Set_Address(String CuAddress)
	{
		 Address.sendKeys(CuAddress);
	}
	public void Set_city(String CITY)
	{
		City.sendKeys(CITY);
	}
	public void Set_State(String statename)
	{
		State.sendKeys(statename);
	}
	public void Set_Pincode(String string)
	{
		PinNumber.sendKeys(String.valueOf(string));
	}
	public void Set_PhoneNumber(String MonNumber)
	{
		MobileNumber.sendKeys(MonNumber);
	}
	public void Set_EmailId(String Email)
	{
		EmailID.sendKeys(Email);
	}
	public void Set_Password(String  CPass) 
	{
		CPassword.sendKeys(CPass);
	}
	public void Click_subButton()
	{
		SubmitButton.click();
	}

}
