package com.videostori.testcases;

import org.testng.annotations.Test;

import com.videostori.pageobject.usermanagement;

public class TC03_userManagement extends TC02_loginPage {
	
	@Test
	public void UsermanagementTest() throws InterruptedException
	{
		
		logger.info("User is at usermanagement page");
		Thread.sleep(2000);
		usermanagement um=new usermanagement(driver);
		um.usermanagementmenu();
		logger.info("UserManagement menu clicked");
		um.usermanagementsubmenu();
		logger.info("Manage user menu clicked");
		um.registernewuser();
		logger.info("Register new user clicked");
		um.ufname("Testing");
		logger.info("User first name Testing");
		um.ulname("one");
		logger.info("User last name one");
		um.uemail("siddharth@gmail.com");
		logger.info("User email siddharth@gmail.com");
		um.umobile("7018805794");
		logger.info("User mobile number 7018805794");
		um.upwd("Sid@1234");
		logger.info("User pwd Sid@1234");
		um.cpwd("Sid@1234");
		logger.info("User confirm pwd Sid@1234");
		um.urole("Public User");
		logger.info("Public User selected");
		um.ureg();
		logger.info("click on user registration");
		
		System.out.print("Test Case 3 Passed user is able to register user");
		
	}
	

}
