package com.sgtesting.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assign1onPom {
	public static WebDriver oBrowser=null;
	public static Assignment1Actitime oPage=null;
	public static void main(String[] args) {

		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		deleteUser();
		logout();
		closeApplication();
	}

	static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new Assignment1Actitime (oBrowser);
			Thread.sleep(2000);
			System.out.println("Browser Launched...");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:81/login.do");
			Thread.sleep(2000);
			System.out.println("Navigation Done...");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassWord().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(4000);
			System.out.println("Admin Login Successful...");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
			System.out.println("FlyOutWindow Minimized...");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void createUser()
	{
		try
		{
			oPage.getCreateUser().click();
			oPage.getAddUser().click();
			oPage.getCreateuserFirstname().sendKeys("Premala");
			oPage.getCreateUserLastName().sendKeys("Khot");
			oPage.getCreateUserEmail().sendKeys("premlakhot108@gmail.com");
			oPage.getCreateUsername().sendKeys("Premala");
			oPage.getCreateUserpassword().sendKeys("123456");
			oPage.getCreateUserConfirmPassword().sendKeys("123456");
			oPage.getCreateUserConfirm().click();
			Thread.sleep(3000);
			System.out.println("User Created...");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser()
	{
		try {
			oPage.getselectCreateusertoDelete().click();
			Thread.sleep(3000);
			oPage.getselectDeleteUser().click();
			Thread.sleep(3000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();Thread.sleep(3000);
			Thread.sleep(2000);
			System.out.println("User Deleted...");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(2000);
			System.out.println("Logout Successfully...");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void closeApplication()
	{
		try
		{
			oBrowser.quit();
			System.out.println("Application Closed..");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}	
}