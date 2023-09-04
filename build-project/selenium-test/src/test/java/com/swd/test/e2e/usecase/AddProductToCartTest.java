package com.swd.test.e2e.usecase;

import com.swd.framework.adapters.browser.webdriver.ChromeDriverFactory;
import com.swd.framework.test.common.BaseTestNGDriverTest;
import com.swd.page.HomePage;
import com.swd.page.StorePage;
import com.swd.usecase.AddProductToCart;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProductToCartTest extends BaseTestNGDriverTest {

    private AddProductToCart useCase;

    public AddProductToCartTest() {
        super(new ChromeDriverFactory());
    }

    @Override
    public void tearUp() {
        useCase = new AddProductToCart(this.driver,
                new HomePage(this.driver),
                new StorePage(this.driver));
    }

    @Override
    public void tearDown(){
        useCase = null;
    }

    @Test
    public void shouldAddProduct() {
        useCase.addProduct("Blue Shoes");
        Assert.assertEquals(driver.getCurrentUrl(),"https://askomdch.com/cart/");
    }
}
