package com.main.misc;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.*;



public class HtmlUnitDrv {
	
		 
		public static void main(String[] args) throws IOException {
		 
		    WebDriver driver = new HtmlUnitDriver();
            

		 
	 	//driver.setJavascriptEnabled(false);
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		 
		System.out.println(driver.getTitle());
		 
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		// Now you can do whatever you need to do with it, for example copy somewhere
		 
		FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));

		 
		}


}
