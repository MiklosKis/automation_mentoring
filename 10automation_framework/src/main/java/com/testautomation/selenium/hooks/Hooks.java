package com.testautomation.selenium.hooks;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = new ChromeDriver();

    }

    public static WebDriver getDriver(){
        return driver;
    }

    @BeforeEach
    public void start() {
        driver.manage().window().maximize();
    }

    @AfterAll
    public static void tearDown() throws Exception {
        if (driver != null) {
            driver.quit();
        }
    }
}
