package com.swd.framework.adapters.page;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import java.util.UUID;

public class BasePage {

    protected WebDriver driver;

    protected FluentWait<WebDriver> wait;
    protected TakesScreenshot screenshot;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.screenshot = (TakesScreenshot)driver;
        this.wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
                                          .pollingEvery(Duration.ofSeconds(2));
    }

    public void takeScreenShot() throws IOException {
       File file = screenshot.getScreenshotAs(OutputType.FILE);
       String targetPath = "src" +
               File.separator +
               "test" + File.separator +
               "resources" + File.separator +
               UUID.randomUUID().toString() +
               ".png";

       Files.copy(file.toPath(), Paths.get(targetPath), StandardCopyOption.REPLACE_EXISTING);
    }

}
