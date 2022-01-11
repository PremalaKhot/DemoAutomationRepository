package com.sgtesting.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo1
{
	private static WebDriver oBrowser=null;

	public static void main(String[] args) 
	{
		LaunchBrowser();
		navigate();
		closeApplication();
	}

	private static void LaunchBrowser() 
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","G:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			System.out.println("Browser Launched...");
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
	private static void navigate() 
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(4000);
			System.out.println("Navigation Done...");
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
	private static void closeApplication()
	{
		try
		{
			oBrowser.close();
			System.out.println("Application Closed...");
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
}