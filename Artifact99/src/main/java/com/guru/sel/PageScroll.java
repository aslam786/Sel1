package com.guru.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PageScroll {
	WebDriver driver;
	String URL = "https://www.linkedin.com/";

	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get(URL);
		driver.manage().window().maximize();
	}

	@Test(priority=1)
	public void scrollingToBottomofAPage() throws InterruptedException {
		driver.navigate().to(URL);
		 ((JavascriptExecutor) driver)
         .executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 Thread.sleep(5000);
	}

	@Test(priority=2)
	public void scrollingToElementofAPage() throws InterruptedException {
		driver.navigate().to(URL+"directory/companies?trk=hb_ft_companies_dir");
		WebElement element = driver.findElement(By.linkText("Import/Export"));
		((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", element);
		 Thread.sleep(5000);
		
	}
	
	@Test(priority=3)
	public void scrollingByCoordinatesofAPage() throws InterruptedException {
		driver.navigate().to(URL+"job/?trk=hb_ft_jobs");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		 Thread.sleep(5000);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}