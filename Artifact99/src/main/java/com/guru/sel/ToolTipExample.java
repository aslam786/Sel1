package com.guru.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ToolTipExample {

	String seleniumURL = "http://docs.seleniumhq.org";
	String jQueryURL = "https://jqueryui.com/tooltip/";
	public WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void toolTipCase1() throws InterruptedException {
		driver.navigate().to(seleniumURL);

		WebElement element = driver.findElement(By.cssSelector("#header>h1>a"));
		// Get tooltip text
		String toolTipText = element.getAttribute("title");
		System.out.println("Tool tip text present :- " + toolTipText);

		// Compare toll tip text
		Assert.assertEquals("Return to Selenium home page", toolTipText);
		Thread.sleep(7000);
	}

	@Test
	public void toolTipCase2() throws InterruptedException {
		driver.navigate().to(jQueryURL);

		// As there is frame, we have to navigate to frame
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));

		// Text box field, where we mouse hover
		WebElement element = driver.findElement(By.id("age"));

		// Use action class to mouse hover on Text box field
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		WebElement toolTipElement = driver.findElement(By.cssSelector(".ui-tooltip-content"));

		// To get the tool tip text and assert
		String toolTipText = toolTipElement.getText();
		Assert.assertEquals("We ask for your age only for statistical purposes.", toolTipText);

		Thread.sleep(7000);
		
	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}