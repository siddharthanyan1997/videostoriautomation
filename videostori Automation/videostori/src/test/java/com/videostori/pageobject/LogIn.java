package com.videostori.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {

WebDriver ldriver;
	

	public LogIn(WebDriver rdriver) 
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//button[@class='chakra-button css-gklt4u']")
	WebElement logIntest;
	
	@FindBy(name="email")
	WebElement emailaddress;
	
	@FindBy(name="password")
	WebElement loginpwd;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement loginbtn;
	
	public void logIntest() 
	{
		logIntest.click();
	}
	
	public void emailaddress(String Email) 
	{
		emailaddress.sendKeys(Email);
	}
	
	public void loginpwd(String pwd) 
	{
		loginpwd.sendKeys(pwd);
	}
	public void loginbtn() 
	{
		loginbtn.click();;
	}
		
	
}
