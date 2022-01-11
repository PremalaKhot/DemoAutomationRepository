package com.sgtesting.actiassignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass2 {
	private static WebDriver oBrowser=null;
	
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		modifyUser();
		deleteUser();
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
	
	private static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			oBrowser.findElement(By.name("firstName")).sendKeys("Arati");
			oBrowser.findElement(By.name("lastName")).sendKeys("Khot");
			oBrowser.findElement(By.name("email")).sendKeys("Arati@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("Premala");
			oBrowser.findElement(By.name("password")).sendKeys("WelcomeArati");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("WelcomeArati");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			System.out.println("User Created...");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Khot, Arati']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).click();
			oBrowser.findElement(By.name("firstName")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("system");
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();
			System.out.println("Usename Changed....");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Khot, system']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			//Alert oAlert=oBrowser.switchTo().alert();
			//String strContent=oAlert.getText();
			//System.out.println(strContent);
			//oAlert.accept();
			Thread.sleep(2000);
			System.out.println("User Deleted...");
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