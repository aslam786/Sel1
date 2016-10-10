package com.guru.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;




public class FrameSwitch {
public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver(); //navigates to the Browser
	    driver.get("http://www.guru99.com/selenium-tutorial.html"); 
	       // navigates to the page consisting an iframe

	      // driver.manage().window().maximize();
	      // driver.switchTo().frame("_mN_main_196378856"); //switching the frame by ID

			System.out.println("********We are switch to the iframe*******");
     		WebElement element = driver.findElement(By.xpath("//*[@id='rt-mainbody']/div/article/div/ol[4]/li[30]/a"));
  		    //Clicks the iframe
     		
     		element.click();
     		
     		/*Actions action = new Actions (driver);
     		  
     		action.moveToElement(element).click().build().perform();
       */
  			System.out.println("*********We are done***************");
      }
}		