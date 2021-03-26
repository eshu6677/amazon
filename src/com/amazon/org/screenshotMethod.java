package com.amazon.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class screenshotMethod {
	public String screenshot;
	public String target;
	public static WebDriver driver;
	public static void screen( ) throws IOException   {
		TakesScreenshot  ts=(TakesScreenshot) driver;
	    File screenshot = ts.getScreenshotAs(OutputType.FILE);
	   File target = new File("C:\\Users\\em21154\\eclipse-workspace\\Amazon\\amazonscreenshots\\"+driver.getTitle()+".jpg");
	   FileUtils.copyFile(screenshot, target);
	 
	}

}
