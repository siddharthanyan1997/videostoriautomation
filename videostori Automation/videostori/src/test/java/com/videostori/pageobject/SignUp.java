package com.videostori.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {
	
	WebDriver ldriver;
	

	public SignUp(WebDriver rdriver) 
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}

	@FindBy(id ="firstname")
	WebElement fname;
	
	@FindBy(id ="Last Name")
	WebElement lname;
	
	@FindBy(id = "email")
	WebElement mail;
	
	@FindBy(name = "mobileno")
	WebElement mnumber;
	
	@FindBy(id ="password")
	WebElement pwd;
	
	@FindBy(id = "confirmPassword")
	WebElement cpwd;
	
	@FindBy(id= "acceptTerms")
	WebElement terms;
	
	@FindBy(xpath ="//button[normalize-space()='Click here to agree to the above Terms of service']")
	WebElement agreeterms;
	
	@FindBy(xpath="//button[normalize-space()='Sign Up']")
	WebElement signupbtn;
	
	

	public void fname(String firstname) 
	{
		fname.sendKeys(firstname);
	}
	
	public void lname(String lastname) 
	{
		lname.sendKeys(lastname);
	}
	
	public void mail(String emailAdd) 
	{
		mail.sendKeys(emailAdd);
	}
	
	public void mnumber(String string) 
	{
		mnumber.sendKeys(string);
	}
	
	public void pwd(String password) 
	{
		pwd.sendKeys(password);
	}
	
	public void cpwd(String confirmpwd) 
	{
		cpwd.sendKeys(confirmpwd);
	}
	
	public void terms() 
	{
		terms.click();;
	}
	
	public void agreeterms() 
	{
		agreeterms.click();;
	}
	
	public void signupbtn() 
	{
		signupbtn.click();
	}

	
}
