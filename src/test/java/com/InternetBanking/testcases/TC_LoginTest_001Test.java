package com.InternetBanking.testcases;


import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.intrnetBanking.PageObjects.Add_customer_Page;

import com.intrnetBanking.PageObjects.LogIn_Page;

public class TC_LoginTest_001Test extends BaseClass
{
	@Test

	public void LoginTest() throws InterruptedException

	{
	driver.get(baseUrl);
	
	test=extent.createTest("login test exicuted succesfully");
	LogIn_Page Lp=new LogIn_Page(driver);
	
	Lp.Set_UserName(username);
	Lp.Set_Password(password);
	Lp.Click_LG_Button();
	Thread.sleep(3000);
	
	Add_customer_Page  AP=new Add_customer_Page (driver);
	Thread.sleep(6000);
	AP.Click_NewCutomer();
	Thread.sleep(4000);
	AP.Set_Customer_Name("GuruDemo");
    Thread.sleep(1000);
    AP.Sel_Gender();
    Thread.sleep(1000);
    AP.Set_DOB("11" ,"05", "2021");
    Thread.sleep(1000);
	AP.Set_Address("NEARSTREETCROSS12AMNOCITY");
	Thread.sleep(1000);
	AP.Set_city("AMNOCITY");
	Thread.sleep(1000);
	AP.Set_State("KANMANSTATE");
	Thread.sleep(1000);
	AP.Set_Pincode("523646");
	Thread.sleep(1000);
	AP.Set_PhoneNumber("1236589740");
	Thread.sleep(1000);
	String email = Randomstring()+"@gmail.com";//becouse if we run multipletime this testcase same emailid is not valid 
	AP.Set_EmailId(email);
	Thread.sleep(1000);
	AP.Set_Password("12563ADDFE@#$");
	Thread.sleep(1000);
	AP.Click_subButton();
	
	
	
	

	
	
	
}
	//to generate Unique emailid
	public String Randomstring()
	{
		String generatedemail = RandomStringUtils.randomAlphabetic(8);
		return generatedemail;
		
	}
}
