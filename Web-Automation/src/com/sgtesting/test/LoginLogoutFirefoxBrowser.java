package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogoutFirefoxBrowser {
	private static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		logout();
		closeapplication();
	}

	private static void launchbrowser() {
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", "Library\\drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
			System.out.println("Browser Launched..");
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
			System.out.println("Navigation Done..");
			Thread.sleep(4000);
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
			oBrowser.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();
			Thread.sleep(4000);
			System.out.println("Login Successfully...");	
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
			oBrowser.findElement(By.linkText("logout")).click();
			Thread.sleep(2000);
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
			System.out.println("Logout Successfully...");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}