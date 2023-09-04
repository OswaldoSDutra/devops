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
        options.addArguments("--headless=new");

        options.addArguments("--window-size=1920,1080");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--allow-running-insecure-content");

        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("--no-sandbox"); // Bypass OS security model

        return new ChromeDriver(options);
    }
}
