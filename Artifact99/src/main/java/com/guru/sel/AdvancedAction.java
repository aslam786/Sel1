package com.guru.sel;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AdvancedAction {
	
	

	public static void main(String[] args) throws InterruptedException {
	String baseUrl = "http://newtours.demoaut.com/";
	        WebDriver driver = new FirefoxDriver();

	        driver.get(baseUrl);           
	        WebElement link_Home = driver.findElement(By.linkText("Hotels"));
	        WebElement td_Home = driver
	                .findElement(By
	                .xpath("//html/body/div"
	                + "/table/tbody/tr/td"
	                + "/table/tbody/tr/td"
	                + "/table/tbody/tr/td"
	                + "/table/tbody/tr"));    
	        
	        Actions builder = new Actions(driver);
	        Action mouseOverHome = builder
	                .moveToElement(link_Home).click().build();
	        Thread.sleep(3000);
	        String bgColor = td_Home.getCssValue("background-color");
	        System.out.println("Before hover: " + bgColor);        
	        mouseOverHome.perform();
	
	       
	}
	}

