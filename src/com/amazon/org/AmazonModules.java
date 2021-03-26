package com.amazon.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;



public class AmazonModules extends screenshotMethod {
	
	
	public static void main(String[] args) throws IOException  {
		
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\em21154\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
   driver.findElement(By.linkText("Best Sellers")).click();
   screen();
}
}
