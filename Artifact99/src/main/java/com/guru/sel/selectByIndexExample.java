package com.guru.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class selectByIndexExample {
	WebDriver driver;
	@Test
	public void selectSamples() throws InterruptedException
	{
		driver = new FirefoxDriver();
		driver.get("C:\\Users\\Trader\\workspace1\\Artifact99\\src\\main\\java\\com\\guru\\sel\\dropdown0select.html");
		WebElement element=driver.findElement(By.name("Mobdevices"));
		Select se=new Select(element);
		//Here we will take multi select dropdown to show you the difference
		Thread.sleep(5000);
		se.selectByVisibleText("HTC");
		Thread.sleep(5000);
		se.deselectAll();
		se.selectByIndex(2);
		

		Thread.sleep(5000);
		se.deselectByIndex(2);
		
		//It will deselect if the visible text HTC is in selected mode
		Thread.sleep(5000);
		se.selectByVisibleText("HTC");
		
		//It will de-select all the values which are selected
		Thread.sleep(5000);
		
		se.deselectAll();
		
	}
}