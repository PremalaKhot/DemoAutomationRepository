package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutChromeBrowser {
	private static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		logout();
		closeAppication();
	}

	private static void launchbrowser() 
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\drivers\\chromedriver.exe");
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
			oBrowser.navigate().to("http://localhost:81/login.do");
			Thread.sleep(4000);
			System.out.println("Navigation Done...");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(4000);
			System.out.println("Login Successful...");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			System.out.println("FlyOutWindow Minimized...");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			System.out.println("Logout successfully...");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeAppication()
	{
		oBrowser.close();
		System.out.println("Application Closed...");
	}
}