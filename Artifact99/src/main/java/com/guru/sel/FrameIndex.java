package com.guru.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameIndex {
public static void main(String[] args) {
	    WebDriver driver = new FirefoxDriver();
	    driver.get("http://www.guru99.com/selenium-tutorial.html");  
	    driver.manage().window().maximize();
	    //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	    int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Size: " + size);
	    for(int i=0; i<size; i++){
	    System.out.println("inside" + i);	
		driver.switchTo().frame(i);
		int total=driver.findElements(By.xpath("html/body/a/img")).size();
		System.out.println(total);
	    driver.switchTo().defaultContent();}}}