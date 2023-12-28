package com.videostori.testcases;

import org.testng.annotations.*;

import com.videostori.pageobject.importVideo;

public class TC04_importVideo extends TC02_loginPage {
	
	@Test
	public void TC04_importVideo() throws InterruptedException 
	{
		logger.info("User is at video management page");
		importVideo iv = new importVideo(driver);
		iv.videomanagementmenu();
		logger.info("Video Management clicked");
		iv.importvideomenu();
		logger.info("Import Video Menu clicked");
		iv.selectVideoType("MP4");
		logger.info("MP4 videoType selected");
		iv.videoTitleText("Video 28 dec 2023");
		logger.info("video title Video 28 dec 2023 entered");
		iv.setExpiryDate();
		logger.info("Set Expiry Date clicked");
		iv.setmonth(2);
		logger.info("Set Expiry Month March");
		iv.setyear(1);
		logger.info("Set Expiry year 2025");
		iv.setdate("1");
		logger.info("Set Expiry date is 1");
		iv.videoDescription("This is for testing purpose");
		logger.info("Description is This is for testing purpose");
		iv.videoTags("#facebook");
		logger.info("Video Tags is #facebook");
		iv.videoSize(0);
		logger.info("Aspect ratio 16:9 is selected");
		//Thread.sleep(3000);
		iv.videoUpload("C:\\Users\\Admin\\Downloads\\Ad 34. Act II Pop Corn.mp4");
		//Thread.sleep(2000);
		logger.info("Video uploaded name is Ad 34. Act II Pop Corn");
		iv.Upload();
		Thread.sleep(2000);
		logger.info("Upload button clicked");
		
		
		}

}
