package com.guru.sel;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SSLFirefox {
	
	private WebDriver driver;

	@BeforeClass
	public void setUp() {
		//Creating new Firefox profile
		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true); 
		profile.setAssumeUntrustedCertificateIssuer(false);
		driver = new FirefoxDriver(profile); 
		driver.manage().window().maximize();
	}
	
	@Test
	public void openApplication() throws InterruptedException {
		System.out.println("Navigating application");
		driver.get("https://cacert.org/");
		WebElement headingEle = driver.findElement(By.cssSelector(".story>h3"));
		//Validate heading after accepting untrusted connection
		String expectedHeading = "Are you new to CAcert?";
		Assert.assertEquals(headingEle.getText(), expectedHeading);
		Thread.sleep(15000);
	}
	
	@AfterClass
	public void tearDown() {
		if(driver!=null) 
			driver.quit();
	}
	
}