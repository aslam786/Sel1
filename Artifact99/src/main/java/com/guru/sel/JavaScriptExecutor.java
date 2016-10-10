package com.guru.sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class JavaScriptExecutor {

 public static void main(String[] args) throws InterruptedException {
  WebDriver driver = new FirefoxDriver();
  //Launching the browser application
  driver.get("http://www.uftHelp.com");
  //Adding wait
  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  //Maximize window
  driver.manage().window().maximize();
  
  Thread.sleep(10000);
  JavascriptExecutor js = (JavascriptExecutor)driver;
 js.executeScript("window.scrollBy(0,50)");
 
 Thread.sleep(10000);
  JavascriptExecutor js1 = (JavascriptExecutor)driver;
  js1.executeScript("alert('hello world');");
  
  Thread.sleep(10000);
  Alert alert = driver.switchTo().alert();
  alert.dismiss();
 
  JavascriptExecutor js2 = (JavascriptExecutor)driver;
  
  String sTitle = js2.executeScript("return document.title;").toString();
  System.out.println("Title = "+sTitle);
 
  
  
 }

}
