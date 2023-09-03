package com.swd.framework.adapters.browser.webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverFactory implements WebDriverFactory {
    /**
     * @return org.openqa.selenium.WebDriver;
     */
    @Override
    public WebDriver createWebDriver() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options=new ChromeOptions();
        options.addArguments("headless");

        return new ChromeDriver(options);
    }
}
