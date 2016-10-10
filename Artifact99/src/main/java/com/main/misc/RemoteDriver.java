package com.main.misc;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteDriver {

	
	public static void main(String[] args) throws IOException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setJavascriptEnabled(true);

        WebDriver driver = new RemoteWebDriver(capabilities);

        driver.get("http://www.google.com");
        
      

		
	}
}
