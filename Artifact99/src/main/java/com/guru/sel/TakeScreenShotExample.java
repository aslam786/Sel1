package com.guru.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
     
    public class TakeScreenShotExample{
        public WebDriver driver;
         
      @Test
      public void openBrowser() throws IOException  {
    	  driver = new FirefoxDriver();
    	  driver.manage().window().maximize();
    	  driver.get("http://www.guru99.com/selenium-tutorial.html");
    	  try{
                //the below statement will throw an exception as the element is not found, Catch block will get executed and takes the screenshot.
    		  driver.findElement(By.id("testing")).sendKeys("test");
                 
                   //if we remove the below comment, it will not return exception and screen shot method will not get executed.
    		  //driver.findElement(By.id("gbqfq")).sendKeys("test");
    	  }
    	  catch (Exception e){
    		  System.out.println("I'm in exception");
              //calls the method to take the screenshot.
    		  getscreenshot();
     	  }
      }
      
      public void getscreenshot() throws IOException
      {
              File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           //The below method will save the screen shot in d drive with name "screenshot.png"
              FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
      }
 }
