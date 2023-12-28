package com.videostori.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class importVideo {
	
WebDriver ldriver;
	

	public importVideo(WebDriver rdriver) 
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//span[normalize-space()='Video Management']")
	WebElement videomanagementmenu;
	
	@FindBy(xpath="//span[normalize-space()='Import Video - Local Drive']")
	WebElement importvideomenu;
	
	@FindBy(xpath="//select[@name='contentType']")  //dropdown
	WebElement selectVideoType;
	
	@FindBy(xpath="//input[@placeholder='Video Title Text ']")
	WebElement videoTitleText;
	
	@FindBy(xpath="//input[@value='28-12-2024']")
	WebElement setExpiryDate;
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")  //dropdown
	WebElement setmonth;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")  //dropdown
	WebElement setyear;
	
	@FindBy(xpath="//div[@aria-label='Choose Saturday, March 1st, 2025']")  //dropdown
	WebElement setdate;
	
	@FindBy(xpath="//input[@placeholder='Input Video Description']")
	WebElement videoDescription;
	
	@FindBy(xpath="//input[@placeholder='Input Tags here...']")
	WebElement videoTags;
	
	@FindBy(xpath="//select[@name='videoSize']")  //dropdown
	WebElement videoSize;
	
	@FindBy(xpath="//input[@id='inputGroupFile02']")
	WebElement videoUpload;
	
	@FindBy(xpath="//button[normalize-space()='Upload']")
	WebElement Upload;
	
	
	public void videomanagementmenu() 
	{
		videomanagementmenu.click();
	}
	
	public void importvideomenu() 
	{
		importvideomenu.click();
	}
	
	public void selectVideoType(String text) 
	{
		Select obj = new Select(selectVideoType);
		obj.selectByVisibleText(text);
		
    }
	
	public void videoTitleText(String title) 
	{
		videoTitleText.sendKeys(title);
	}
	
	public void setExpiryDate() 
	{
		setExpiryDate.click();
	}
	
	public void setmonth(int index) 
	{
		Select obj1 = new Select(setmonth);
		obj1.selectByIndex(index);
				
	}
	
	public void setyear(int index) 
	{
		Select obj2 = new Select(setyear);
		obj2.selectByIndex(index);
				
	}
	
	public void setdate(String text) 
	{
		setdate.click();
				
	}
	public void videoDescription(String description) 
	{
		videoDescription.sendKeys(description);
	}
	
	public void videoTags(String tag) 
	{
		videoTags.sendKeys(tag);
	}
	public void videoSize(int index) 
	{
		Select obj4 = new Select(videoSize);
		obj4.selectByIndex(index);
		
	}
	
	public void videoUpload(String file) 
	{
		videoUpload.sendKeys(file);
		
	}
	public void Upload() 
	{
		Upload.click();
	}
	

}
