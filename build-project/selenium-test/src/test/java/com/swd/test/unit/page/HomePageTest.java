package com.swd.test.unit.page;

import com.swd.page.HomePage;
import com.swd.framework.adapters.browser.webdriver.ChromeDriverFactory;
import com.swd.framework.test.common.BaseTestNGDriverTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePageTest extends BaseTestNGDriverTest {

    private HomePage homePage;

    public HomePageTest() {
        super(new ChromeDriverFactory());
    }

    @Override
    public void tearUp() {
        homePage = new HomePage(this.driver);
    }

    @Override
    public void tearDown(){
        homePage = null;
    }

    @Test
    public void shouldSearch() throws IOException {
        driver.navigate().to("https://askomdch.com/");

        homePage.takeScreenShot();
        homePage.clickStoreLink();

        Assert.assertEquals(driver.getCurrentUrl(),"https://askomdch.com/store/");
    }

}
