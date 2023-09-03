package com.swd.framework.adapters.page;

import com.swd.framework.adapters.browser.webdriver.ChromeDriverFactory;
import com.swd.framework.test.common.BaseTestNGDriverTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class BasePageTest extends BaseTestNGDriverTest {

    private BasePage basePage;

    public BasePageTest(){
        super(new ChromeDriverFactory());
    }

    @Override
    public void tearUp() {
        basePage = new BasePage(this.driver);
    }

    @Override
    public void tearDown() {
        basePage = null;
    }

    @Test
    public void ShouldTakeScreenShot() throws IOException {
        basePage.takeScreenShot();
    }

}
