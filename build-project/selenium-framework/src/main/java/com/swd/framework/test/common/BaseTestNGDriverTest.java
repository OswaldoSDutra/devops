package com.swd.framework.test.common;

import com.swd.framework.adapters.browser.webdriver.WebDriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTestNGDriverTest extends BaseDriverTest {

    public BaseTestNGDriverTest(WebDriverFactory driverFactory) {
        super(driverFactory);
    }

    public abstract void tearUp();
    public abstract void tearDown();

    @BeforeMethod
    @Override
    public void start(){
        super.start();
        tearUp();
    }

    @AfterMethod
    @Override
    public void stop(){
        tearDown();
        super.stop();
    }
}

