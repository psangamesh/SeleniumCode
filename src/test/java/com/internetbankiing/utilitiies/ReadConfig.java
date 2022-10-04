package com.internetbankiing.utilitiies;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{

	Properties pro;
	
	public ReadConfig() 
	{
		File Src=new File("./Configuration/config.properties");
		
		try {
			FileInputStream Fis=new FileInputStream(Src);
			pro=new Properties();
			pro.load(Fis);
			
			
		}catch(Exception e)
		{
			System.out.println("Exception is"+e.getMessage());
		}
		
	}
	public String getApplicationUrl()
	{
		String url = pro.getProperty("baseUrl");
		return url;
		
		
	}
	public String getUsername()
	{
		String uname = pro.getProperty("username");
		return uname;
		
	}
	public String getPassword()
	{
		String Pass = pro.getProperty("password");
		return Pass;
		
	}
	
}
