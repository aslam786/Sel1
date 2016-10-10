package com.guru.sel;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class GetSize {
	
	@Test
	public void openBrowserwithGivenDimension()
	{

		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://google.co.in");
		System.out.println(driver.manage().window().getSize());
		Dimension d = new Dimension(1600,1600);
		//Resize the current window to the given dimension
		driver.manage().window().setSize(d);
	}
}