package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Config {

    private WebDriver driver;

    @BeforeClass
    public void setConfiguration(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
    }

    @Test(priority = 1)
    public void getGoogleTest(){
        driver.get("https://www.google.com");
        System.out.println("Test 1 passed");
    }

    @Test(priority = 2)
    public void getGoogleMapsTest(){
        driver.get("https://www.googlemaps.com");
        System.out.println("Test 2 passed");
    }

    @Test(priority = 3)
    public void getMyTest(){
        driver.get("https://www.facebook.com");
        System.out.println("Test 3 passed");
    }


    @AfterClass
    public void quitDriver(){
        driver.quit();
    }

}

