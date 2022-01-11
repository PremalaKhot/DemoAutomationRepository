package com.sgtesting.actiassignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass10AdvancedScenerio {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		 minimizeFlyPutWindow();
		 createUser1();
			logout();
			loginuser1();
			createUser2();
			logout();
			loginuser2();
			createUser3();
			logout();
			loginuser3();
			logout();
			loginuser2();
			modifyuser3();
			logout();
			loginuser33();
			logout();
			loginuser1();
			modifyuser2();
			logout();
			loginuser22();
			logout();
			login();
			modifyuser1();
			logout();
			loginuser11();
			logout();
			loginuser22();
			deleteUser3();
			logout();
			loginuser11();
			deleteUser2();
			logout();
			login();
			deleteUser1();
			logout();
			closeApplication();
			
	}
	private static void launchBrowser()
	{
		try {
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			oBrowser.navigate().to("http://localhost:81/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
    private static void minimizeFlyPutWindow()
    {
    	try {
    		oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void createUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("sunil");
			oBrowser.findElement(By.name("lastName")).sendKeys("gouli");
			oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginuser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome123");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user2");
			oBrowser.findElement(By.name("lastName")).sendKeys("gouli");
			oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demoUser2");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginuser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome123");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user3");
			oBrowser.findElement(By.name("lastName")).sendKeys("gouli");
			oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demoUser3");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginuser3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome123");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyuser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).clear();
			oBrowser.findElement(By.name("password")).sendKeys("sunilkumar");
			oBrowser.findElement(By.name("passwordCopy")).clear();
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("sunilkumar");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyuser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).clear();
			oBrowser.findElement(By.name("password")).sendKeys("vinodkumar");
			oBrowser.findElement(By.name("passwordCopy")).clear();
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("vinodkumar");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyuser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).clear();
			oBrowser.findElement(By.name("password")).sendKeys("sunilkumar");
			oBrowser.findElement(By.name("passwordCopy")).clear();
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("sunilkumar");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String strContent=oAlert.getText();
			System.out.println(strContent);
			oAlert.accept();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String strContent=oAlert.getText();
			System.out.println(strContent);
			oAlert.accept();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String strContent=oAlert.getText();
			System.out.println(strContent);
			oAlert.accept();
			Thread.sleep(2000);
			
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginuser33()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("sunilkumar");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginuser22()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("sunilkumar");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginuser11()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("vinodkumar");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}