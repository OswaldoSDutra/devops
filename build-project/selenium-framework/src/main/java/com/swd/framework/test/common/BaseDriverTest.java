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

        System.out.println("+----- DEBUG LOG -----+");
        System.out.printf("Current window size: %s \n",this.driver.manage().window().getSize());
    }
    protected void stop(){
        this.driver.quit();
    }

}
