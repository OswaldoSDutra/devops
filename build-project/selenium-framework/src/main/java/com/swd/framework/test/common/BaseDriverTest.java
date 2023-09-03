package com.swd.framework.test.common;

import com.swd.framework.adapters.browser.webdriver.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public abstract class BaseDriverTest {
    protected WebDriver driver;
    protected WebDriverFactory driverFactory;

    public BaseDriverTest(WebDriverFactory driverFactory){
        this.driverFactory = driverFactory;
    }

    protected void start(){
        this.driver = driverFactory.createWebDriver();
        this.driver.manage().window().maximize();
    }
    protected void stop(){
        this.driver.quit();
    }

}
