package com.videostori.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class usermanagement {
	
WebDriver ldriver;
	

	public usermanagement(WebDriver rdriver) 
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//span[normalize-space()='User Management']")
	WebElement usermanagementmenu;
	
	@FindBy(xpath="//span[normalize-space()='Manage Users']")
	WebElement usermanagementsubmenu;
	
	@FindBy(xpath="//button[normalize-space()='Register New User']")
	WebElement registernewuser;
	
	@FindBy(xpath="//input[@placeholder='User first name']")
	WebElement ufname;
	
	@FindBy(xpath="//input[@placeholder='User last name']")
	WebElement ulname;
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	WebElement uemail;
	
	@FindBy(xpath="//input[@placeholder='Enter Waba Number']")
	WebElement umobile;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement upwd;
	
	@FindBy(xpath="//input[@placeholder='Confirm password']")
	WebElement cpwd;
	
	@FindBy(xpath="//select[@name='role_id']")
	WebElement urole;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement ureg;
	
	public void usermanagementmenu () 
	{
		usermanagementmenu.click();
	}
	
	public void usermanagementsubmenu () 
	{
		usermanagementsubmenu.click();
	}
	
	public void registernewuser () 
	{
		registernewuser.click();
	}
	
	public void ufname (String fname) 
	{
		ufname.sendKeys(fname);
	}
	
	public void ulname (String lname) 
	{
		ulname.sendKeys(lname);
	}
	
	public void uemail (String Email) 
	{
		uemail.sendKeys(Email);
	}
	
	public void umobile (String Mobile) 
	{
		umobile.sendKeys(Mobile);
	}
	
	public void upwd (String Password) 
	{
		upwd.sendKeys(Password);
	}
	
	public void cpwd (String ConfirmPassword) 
	{
		cpwd.sendKeys(ConfirmPassword);
	}
	
	public void urole (String text) 
	{
		Select obj = new Select(urole);
		obj.selectByVisibleText(text);
	}
	
	public void ureg () 
	{
		ureg.click();
	}

}
