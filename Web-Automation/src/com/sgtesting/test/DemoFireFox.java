package com.sgtesting.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFireFox {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		Navigate();
		closeapplication();
	}
	private static void LaunchBrowser() {
		try
		{
			System.setProperty("webdriver.gecko.driver", "G:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
			System.out.println("Browser Launched....");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void Navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			System.out.println("Navigation Done...");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void closeapplication()
	{
		try
		{
			oBrowser.close();
			System.out.println("Application Closed...");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}