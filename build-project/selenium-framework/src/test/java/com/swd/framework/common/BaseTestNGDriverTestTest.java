package com.swd.framework.common;

import com.swd.framework.adapters.browser.webdriver.ChromeDriverFactory;
import com.swd.framework.adapters.page.BasePage;
import com.swd.framework.test.common.BaseTestNGDriverTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseTestNGDriverTestTest extends BaseTestNGDriverTest {

    private BasePage page;

    public BaseTestNGDriverTestTest(){
        super(new ChromeDriverFactory());
    }

    @Override
    public void tearUp() {
        page = new BasePage(this.driver);
    }

    @Override
    public void tearDown() {
        page = null;
    }

    @Test
    public void ShouldRunTearUpWithParentClass() {
        Assert.assertNotNull(page);
    }

}
