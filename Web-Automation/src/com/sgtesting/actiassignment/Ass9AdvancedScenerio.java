package com.sgtesting.actiassignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass9AdvancedScenerio {
	private static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchbrowser();
		navigate();
		loginasAdmin();
		minimizeFlyOutWindow();
		createUser1();
		createUser2();
		createUser3();
		logout();
		loginasuser1();
		logoutasuser1();
		loginasuser2();
		logoutasuser2();
		loginasuser3();
		logoutasuser3();
		loginasAdmin();
		minimizeFlyOutWindow();
		modifypswuser1();
		modifypswuser2();
		modifypswuser3();
		logout();
		loginasuser11();
		logoutasuser11();
		loginasuser22();
		logoutasuser22();
		loginasuser33();
		logoutasuser33();	
		loginasAdmin();
		minimizeFlyOutWindow();
		deleteUser1();
		deleteUser2();
		deleteUser3();
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

	private static void loginasAdmin()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(4000);
			System.out.println("Login as Admin is Successful...");
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

	private static void createUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			oBrowser.findElement(By.name("firstName")).sendKeys("User1");
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo1");
			oBrowser.findElement(By.name("email")).sendKeys("user1@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("Premala");
			oBrowser.findElement(By.name("password")).sendKeys("WelcomeUser1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("WelcomeUser1");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			System.out.println("User1 Created...");
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User2");
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo2");
			oBrowser.findElement(By.name("email")).sendKeys("user2@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("Arati");
			oBrowser.findElement(By.name("password")).sendKeys("WelcomeUser2");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("WelcomeUser2");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			System.out.println("User2 Created...");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User3");
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo3");
			oBrowser.findElement(By.name("email")).sendKeys("user3@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("Punyaa");
			oBrowser.findElement(By.name("password")).sendKeys("WelcomeUser3");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("WelcomeUser3");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			System.out.println("User3 Created...");
			Thread.sleep(2000);
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

	private static void loginasuser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Premala");
			oBrowser.findElement(By.name("pwd")).sendKeys("WelcomeUser1");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(6000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
			System.out.println("Login As User1 Successful...");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void logoutasuser1()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			System.out.println("Logout as User1 successfully...");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginasuser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Arati");
			oBrowser.findElement(By.name("pwd")).sendKeys("WelcomeUser2");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(6000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
			System.out.println("Login As User2 Successful...");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void logoutasuser2()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			System.out.println("Logout as User2 successfully...");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginasuser3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Punyaa");
			oBrowser.findElement(By.name("pwd")).sendKeys("WelcomeUser3");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(6000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
			System.out.println("Login As User3 Successful...");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void logoutasuser3()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			System.out.println("Logout as User3 successfully...");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void modifypswuser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Demo1, User1']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("ModifyPswUser1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("ModifyPswUser1");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();
			Thread.sleep(2000);
			System.out.println("Password Changed For User1...");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void modifypswuser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Demo2, User2']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("ModifyPswUser2");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("ModifyPswUser2");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();
			Thread.sleep(2000);
			System.out.println("Password Changed For User2...");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void modifypswuser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Demo3, User3']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("ModifyPswUser3");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("ModifyPswUser3");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();
			Thread.sleep(2000);
			System.out.println("Password Changed For User3...");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	private static void loginasuser11()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Premala");
			oBrowser.findElement(By.name("pwd")).sendKeys("ModifyPswUser1");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
			System.out.println("Login As User11 Successful...");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void logoutasuser11()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			System.out.println("Logout as User11 successfully...");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginasuser22()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Arati");
			oBrowser.findElement(By.name("pwd")).sendKeys("ModifyPswUser2");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
			System.out.println("Login As User22 Successful...");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void logoutasuser22()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			System.out.println("Logout as User22 successfully...");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginasuser33()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Punyaa");
			oBrowser.findElement(By.name("pwd")).sendKeys("ModifyPswUser3");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
			System.out.println("Login As User33 Successful...");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void logoutasuser33()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			System.out.println("Logout as User33 successfully...");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void deleteUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			//String strContent=oAlert.getText();
			//System.out.println(strContent);
			oAlert.accept();
			Thread.sleep(2000);
			System.out.println("User 1 Deleted...");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void deleteUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			//String strContent=oAlert.getText();
			//System.out.println(strContent);
			oAlert.accept();
			Thread.sleep(2000);
			System.out.println("User2 Deleted....");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void deleteUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			//String strContent=oAlert.getText();
			//System.out.println(strContent);
			oAlert.accept();
			Thread.sleep(2000);
			System.out.println("User 3 Deleted....");

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