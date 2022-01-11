package com.sgtesting.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5POM 
{
	public static WebDriver oBrowser=null;
	public static Assignment1Actitime oPage=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		deleteProject();
		deleteCustomer();
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
			System.out.println("Browser Launched..");
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
			System.out.println("Navigation Done..");
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
	static void createCustomer()
	{
		try
		{
			oPage.getCreateCustomertoclickTask().click();
			Thread.sleep(1000);
			oPage.getCreateAddNewCustomerUnderTaskbar().click();
			Thread.sleep(1000);
			oPage.getcreateCustomertoselectNewCustomer().click();
			Thread.sleep(1000);
			oPage.getGiveCustomername().sendKeys("JOHN");
			Thread.sleep(1000);
			oPage.getconfirmCreateCustomer().click();
			Thread.sleep(3000);
			System.out.println("Customer Created..");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createProject()
	{
		try
		{
			oPage.getclickAddNew().click();
			oPage.getclickNewprojectunderADDNew().click();
			Thread.sleep(2000);
			oPage.getGiveProjectnameonnameField().sendKeys("OLD PROJECT");
			Thread.sleep(1000);
			oPage.getconfirmCreateproject().click();
			Thread.sleep(1000);
			System.out.println("Project Created...");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteProject()
	{
		try
		{
			oPage.getclicksettingsatproject().click();
			Thread.sleep(1000);
			oPage.getclickActionsinProject().click();
			Thread.sleep(1000);
			oPage.getclickDeleteonProject().click();
			Thread.sleep(1000);
			oPage.getconfirmDeleteProject().click();
			Thread.sleep(1000);
			System.out.println("Project Deleted...");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteCustomer()
	{
		try {
			oPage.getclickSettingCustomertoModifyorDelete().click();
			Thread.sleep(3000);
			oPage.getclickActionButtontoDeleteCustomer().click();
			oPage.getclickDeleteCutomer().click();
			Thread.sleep(1000);
			oPage.getClickDeleteCustomerConfirm().click();
			Thread.sleep(3000);
			System.out.println("Customer Deleted...");
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
			System.out.println("Successfully Logout...");
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
			System.out.println("Application Closed...");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

}


