package com.swd.usecase;

import com.swd.page.HomePage;
import com.swd.page.StorePage;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class AddProductToCart {

    private WebDriver driver;
    private HomePage homePage;
    private StorePage storePage;

    public AddProductToCart(WebDriver driver
            , HomePage homePage
            , StorePage storePage){
        this.driver = driver;
        this.homePage = homePage;
        this.storePage = storePage;
    }

    private void accessStorePage() throws IOException {
        driver.navigate().to("https://askomdch.com/");
        storePage = homePage.clickStoreLink();
    }

    private void searchProduct(String product){
        storePage.search(product);
    }

    public AddProductToCart addProduct(String product) throws IOException {
        accessStorePage();
        storePage.clickAddToCartBtn(product);
        storePage.clickViewCart();
        return this;
    }

}
