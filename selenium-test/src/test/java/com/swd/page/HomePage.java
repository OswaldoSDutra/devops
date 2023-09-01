package com.swd.page;

import com.swd.framework.adapters.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final By storeMenuLink = By.cssSelector("#menu-item-1227 > a");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public StorePage clickStoreLink(){
        driver.findElement(storeMenuLink).click();
        return new StorePage(driver);
    }
}