package com.swd.test.unit.page;

import com.swd.page.StorePage;
import com.swd.framework.adapters.browser.webdriver.ChromeDriverFactory;
import com.swd.framework.test.common.BaseTestNGDriverTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StorePageTest extends BaseTestNGDriverTest {

    private StorePage storePage;

    public StorePageTest() {
        super(new ChromeDriverFactory());
    }

    @Override
    public void tearUp() {
        storePage = new StorePage(this.driver);
    }

    @Override
    public void tearDown(){
        storePage = null;
    }

    @Test
    public void shouldSearchProducts() throws InterruptedException {
        driver.navigate().to("https://askomdch.com/store/");

        storePage.search("blue");
        storePage.clickAddToCartBtn("Blue Shoes");

        Assert.assertTrue(driver.getCurrentUrl().contains("s=blue&post_type=product"));
    }

    @Test
    public void shouldAddAndGoToCart() throws InterruptedException {
        driver.navigate().to("https://askomdch.com/store/");

        storePage.search("blue");
        storePage.clickAddToCartBtn("Blue Shoes");

        storePage.clickViewCart();

        Assert.assertEquals(driver.getCurrentUrl(),"https://askomdch.com/cart/");
    }

}
