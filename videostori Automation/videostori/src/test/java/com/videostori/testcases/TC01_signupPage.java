package com.videostori.testcases;

import org.testng.annotations.*;

import com.videostori.pageobject.SignUp;
import com.videostori.pageobject.indexPage;

public class TC01_signupPage extends BaseClass {
	
	@Test
	public void registration() throws InterruptedException 
	{
		driver.get(url);
		logger.info("url opened");
		
		indexPage pg = new indexPage(driver);
		pg.clickOnTryForFree();
		logger.info("Click on TryForFree button");
		SignUp su = new SignUp(driver);
		su.fname("Siddharth");
		logger.info("First name Testing");
		su.lname("Test");
		logger.info("last name Siddharth ");
		su.mail("siddharthtest@gmail.com");
		logger.info("Email Address siddharthtest@gmail.com");
		su.mnumber("7018805799");
		logger.info("Mobile Number 7018805794");
		su.pwd("Sid@1234");
		logger.info("Pwd Sid@1234");
		su.cpwd("Sid@1234");
		logger.info("Confirm Pwd Sid@1234");
		su.terms();
		logger.info("Clicked on terms");
		su.agreeterms();
		logger.info("Clicked on agree terms");
		Thread.sleep(2000);
		su.signupbtn();
		logger.info("Clicked on signupbtn");
		System.out.print("TestCase Pass user is able to signup");
	}

}
