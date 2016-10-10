package com.guru.sel;


import org.openqa.selenium.*;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ImageLink {

    public static void main(String[] args) {
        String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";
        WebDriver driver = new FirefoxDriver();

        driver.get(baseUrl);
        //click on the "Facebook" logo on the upper left portion
        driver.findElement(By.cssSelector(".fb_logo.img")).click();

        //verify that we are now back on Facebook's homepage
        System.out.println(driver.getTitle());
        if (driver.getTitle().equals("Facebook - Log In or Sign Up")) {
            System.out.println("We are back at Facebook's homepage");
        } else {
            System.out.println("We are NOT in Facebook's homepage");
        }
        driver.quit();
    }
}