package com.swd.framework.adapters.browser.webdriver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class ChromeDriverFactoryTest {

    protected WebDriver driver;

    @BeforeMethod
    public void tearUp(){
        WebDriverFactory driverFactory = new ChromeDriverFactory();
        driver = driverFactory.createWebDriver();;
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void ShouldTakeScreenShot() throws IOException {
        this.driver.manage().window().maximize();
    }

}
