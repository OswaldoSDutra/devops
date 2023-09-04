package com.swd.page;

import com.swd.framework.adapters.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;

public class HomePage extends BasePage {

    private final By storeMenuLink = By.cssSelector("#menu-item-1227 > a");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public StorePage clickStoreLink() throws IOException {
        takeScreenShot();
        wait.until(ExpectedConditions.elementToBeClickable(storeMenuLink)).click();
        return new StorePage(driver);
    }
}
