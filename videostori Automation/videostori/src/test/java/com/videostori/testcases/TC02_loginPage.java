package com.videostori.testcases;

import org.testng.annotations.Test;

import com.videostori.pageobject.LogIn;

public class TC02_loginPage extends BaseClass {
	
	@Test
	public void LogInTest() throws InterruptedException
	{
		driver.get(url);
		logger.info("User is at login page");
		
		LogIn lg=new LogIn(driver);
		lg.logIntest();
		logger.info("LogIn button clicked");
		lg.emailaddress("siddharth.anyan@msdi.in");
		logger.info("Email Address siddharth.anyan@msdi.in");
		lg.loginpwd("Msdi@1234");
		logger.info("login password Msdi@1234");
        lg.loginbtn();
        logger.info("login button clicked for login");
		Thread.sleep(2000);
		System.out.print("Test Case Passed and user is able to login");
	}
	
}
