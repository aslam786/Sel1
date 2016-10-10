package com.guru.sel;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UpLoadFile {

	
	public static void main(String[] args) {

	String baseUrl = "http://www.megafileupload.com/";
	WebDriver driver = new FirefoxDriver();

	driver.get(baseUrl);
	WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

	// enter the file path onto the file-selection input field
	uploadElement.sendKeys("C:\\newhtml.html");

	// check the "I accept the terms of service" check box
	driver.findElement(By.id("terms")).click();

	// click the "UploadFile" button
	driver.findElement(By.name("send")).click();
	}
	}

